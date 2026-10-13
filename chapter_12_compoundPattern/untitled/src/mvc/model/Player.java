package mvc.model;

import java.util.*;

public class Player {

    PlayerStatus playerStatus = PlayerStatus.PAUSED;
    Song currentSong = null;

    Map<Integer, Song> playlist = new HashMap<Integer, Song>();

    public Player() {

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
    }

    public void play() {
        playerStatus = PlayerStatus.PLAY;
    }

    public void pause() {
        playerStatus = PlayerStatus.PAUSED;
    }
}
