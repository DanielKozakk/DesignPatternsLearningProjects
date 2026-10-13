package mvc.model;

import mvc.model.observer.event.Event;
import mvc.model.observer.Observable;
import mvc.model.observer.Observer;
import mvc.model.observer.event.PlayerStateChangedEvent;
import mvc.model.observer.event.PlaylistUpdatedEvent;

import java.util.*;

public class Player implements Observable {

    private PlayerActionStatus playerActionStatus = PlayerActionStatus.PAUSED;
    private Song currentSong = null;

    private Map<Integer, Song> playlist = new HashMap<Integer, Song>();

    private List<Observer> observers = new ArrayList<>();

    public void init(){

        Song first = new Song("Imagine", "John Lennon");
        Song second = new Song("Master of Puppets", "Metallica");
        Song third = new Song("Akcyza", "Troty");
        Song fourth = new Song("Oczy Zielone", "Zenek Martyniuk");
        Song fifth = new Song("Billie Jean", "Michale Jackson");

        addSongToPlaylist(first);
        addSongToPlaylist(second);
        addSongToPlaylist(third);
        addSongToPlaylist(fourth);
        addSongToPlaylist(fifth);

        notifyObservers(getPlaylistUpdatedEvent());
    }

    private void addSongToPlaylist(Song song) {
        int id = song.getId();
        playlist.put(id, song);
    }

    public void nextSong() {
        int nextId;
        if (currentSong == null || !playlist.containsKey(currentSong.getId() + 1)) {
            nextId = 0;
        } else {
            nextId = currentSong.getId() + 1;
        }
        currentSong = playlist.get(nextId);
        notifyObservers(getPlayerStateChangedEvent());
    }

    public void play(int id) {
        currentSong = playlist.get(id);
        playerActionStatus = PlayerActionStatus.PLAY;
        notifyObservers(getPlayerStateChangedEvent());
    }


    public void pause() {
        playerActionStatus = PlayerActionStatus.PAUSED;
        notifyObservers(getPlayerStateChangedEvent());
    }


    @Override
    public void notifyObservers(Event event) {
        for(Observer observer: observers){
            observer.update(event);
        }
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public PlaylistUpdatedEvent getPlaylistUpdatedEvent(){
        return new PlaylistUpdatedEvent(playlist.values().stream().toList());
    }
    public PlayerStateChangedEvent getPlayerStateChangedEvent(){
        return new PlayerStateChangedEvent(currentSong, playerActionStatus);
    }

}
