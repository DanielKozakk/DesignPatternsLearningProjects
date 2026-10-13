package mvc.view;

import mvc.Controller;
import mvc.model.PlayerActionStatus;
import mvc.model.Song;
import mvc.model.observer.event.Event;

import mvc.model.observer.Observer;
import mvc.model.observer.event.PlayerStateChangedEvent;
import mvc.model.observer.event.PlaylistUpdatedEvent;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements Observer {
    Controller controller;

    public JList<Song> playlist;
    public JLabel playerState;
    public JButton pauseButton;
    public JButton playButton;
    public JButton nextSongButton;

    public View(Controller controller) {
        super("Audio Player");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLayout(new BorderLayout(10, 10));

        playlist = new JList<>();
        playlist.setSelectionMode(
                ListSelectionModel.SINGLE_SELECTION
        );
        playlist.setSelectedIndex(0);

        add(new JScrollPane(playlist), BorderLayout.NORTH);


        playerState = new JLabel(
                "",
                SwingConstants.CENTER
        );
        playerState.setFont(new Font("Arial", Font.BOLD, 18));

        add(playerState, BorderLayout.CENTER);

        // Playback controls at the bottom
        JPanel controls = new JPanel(
                new FlowLayout(FlowLayout.CENTER, 15, 10)
        );

        pauseButton = new JButton("Pause");
        playButton = new JButton("Play");
        nextSongButton = new JButton("Next Song");

        pauseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.pause();
            }
        });

        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = playlist.getSelectedValue().getId();
                controller.play(id);
            }
        });

        nextSongButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.nextSong();
            }
        });

        controls.add(pauseButton);
        controls.add(playButton);
        controls.add(nextSongButton);

        add(controls, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true);

        this.controller = controller;

    }

    @Override
    public void update(Event event) {
        if (event instanceof PlaylistUpdatedEvent) {
            playlist.setListData(((PlaylistUpdatedEvent) event).getPlaylist().toArray(Song[]::new));
        } else if (event instanceof PlayerStateChangedEvent) {
            String newStatusBar = createNewStatusBar((PlayerStateChangedEvent) event);
            playerState.setText(newStatusBar);
        }
    }

    private String createNewStatusBar(PlayerStateChangedEvent event) {

        String newState = "";
        PlayerActionStatus status = event.getCurrentState();

        if (status == PlayerActionStatus.PAUSED) {
            newState = "PAUSED: ";
        } else if (status == PlayerActionStatus.PLAY) {
            newState = "PLAYING: ";
        }

        String songName = event.getSong().getName();
        String author = event.getSong().getAuthor();


        return newState + songName + " - " + author;
    }

}
