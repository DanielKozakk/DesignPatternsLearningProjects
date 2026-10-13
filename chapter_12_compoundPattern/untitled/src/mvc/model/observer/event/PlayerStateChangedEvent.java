package mvc.model.observer.event;

import mvc.model.PlayerActionStatus;
import mvc.model.Song;

public class PlayerStateChangedEvent extends Event {

    Song song;
    PlayerActionStatus currentState;

    public PlayerStateChangedEvent(Song song, PlayerActionStatus currentState) {
        this.song = song;
        this.currentState = currentState;
    }

    public Song getSong() {
        return song;
    }

    public PlayerActionStatus getCurrentState() {
        return currentState;
    }
}
