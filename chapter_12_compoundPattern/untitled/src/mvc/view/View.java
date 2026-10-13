package mvc.view;

import mvc.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame {
    Controller controller;

    public JList<String> playlist;
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
        String[] songs = {
                "Imagine - John Lennon",
                "Hotel California - Eagles",
                "Sweet Child O' Mine - Guns N' Roses",
                "Billie Jean - Michael Jackson",
                "Nothing Else Matters - Metallica"
        };

        playlist = new JList<>(songs);
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
                System.out.println(playlist.getSelectedValue());
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
}
