package mvc;

import mvc.model.Player;

public class Controller {
    Player player;

    public Controller(Player player) {
        this.player = player;
    }

    public void pause(){
        player.pause();
    }
    public void play(int id){
        player.play(id);
    }

    public void nextSong(){
        player.nextSong();
    }

    public int getIdOfCurrentSong(){
        return player.getCurrentSongId();
    }

    public void addSong(String name, String author){
        player.addSong(name, author);
    }



}
