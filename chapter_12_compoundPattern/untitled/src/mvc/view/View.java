package mvc.view;

import mvc.Controller;
import mvc.model.Song;
import mvc.model.observer.event.Event;
import mvc.model.observer.event.EventType;
import mvc.model.observer.Observer;
import mvc.model.observer.event.PlaylistUpdatedEvent;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements Observer {
    Controller controller;

    public JList<Song> playlist;
    public JLabel currentSong;
    public JButton pauseButton;
    public JButton playButton;
    public JButton nextSongButton;

    public View(Controller controller) {
        super("Audio Player");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLayout(new BorderLayout(10, 10));

        // Playlist at the top
//      Song[] songs  = controller.getPlaylist().toArray(Song[]::new);

        playlist = new JList<>();
        playlist.setSelectionMode(
                ListSelectionModel.SINGLE_SELECTION
        );
        playlist.setSelectedIndex(0);

        add(new JScrollPane(playlist), BorderLayout.NORTH);

        // Current song in the middle
        currentSong = new JLabel(
                "Now playing: Imagine - John Lennon",
                SwingConstants.CENTER
        );
        currentSong.setFont(new Font("Arial", Font.BOLD, 18));

        add(currentSong, BorderLayout.CENTER);

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
                pause();
            }
        });

        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println(playlist.getSelected());
                play();
            }
        });

        nextSongButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nextSong();
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

    public void playSongById(){

    }

    public void nextSong(){

    }

    public void play(){

    }

    public void pause(){

    }

    @Override
    public void update(Event event) {
        if(event instanceof PlaylistUpdatedEvent){
            playlist.setListData(((PlaylistUpdatedEvent) event).getPlaylist().toArray(Song[]::new));
        }
    }


}
