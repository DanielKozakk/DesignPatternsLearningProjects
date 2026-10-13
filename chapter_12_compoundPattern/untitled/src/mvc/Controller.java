package mvc;

import mvc.model.Player;
import mvc.model.PlayerStatus;
import mvc.model.Song;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    public String getStatusBar(){
        PlayerStatus status = player.getPlayerStatus();
        String statusString ="";
        if(status == PlayerStatus.PAUSED){
            statusString = "PAUSED: ";
        } else if(status == PlayerStatus.PLAY){
            statusString = "PLAYING: ";
        }

        String songName = player.getCurrentSongName();
        String author = player.getCurrentSongAuthor();


        return statusString + songName + " - " + author;
    }

    public List<Song> getPlaylist(){
        Map<Integer, Song> mapPlaylist = player.getPlaylist();
        return mapPlaylist.values().stream().toList();
    }



}
