package mvc.model.observer.event;

import mvc.model.Song;

import java.util.List;

public class PlaylistUpdatedEvent extends Event {

    List<Song> playlist;

    public PlaylistUpdatedEvent(List<Song> playlist) {
        this.playlist = playlist;
    }

    public List<Song> getPlaylist() {
        return playlist;
    }
}
