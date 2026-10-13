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
    private JButton addSongButton = new JButton("Add Song");

    private CardLayout cardLayout;
    private JPanel mainPanel;

    private JTextField titleField;
    private JTextField authorField;

    private static final String PLAYER_VIEW = "player";
    private static final String ADD_SONG_VIEW = "addSong";


    public View(Controller controller) {
        super("Audio Player");

        this.controller = controller;

        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout(10, 10));


        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        JPanel playerPanel = createPlayerPanel();
        JPanel addSongPanel = createAddSongPanel();

        mainPanel.add(playerPanel, PLAYER_VIEW);
        mainPanel.add(addSongPanel, ADD_SONG_VIEW);

        JPanel topBar = new JPanel(new FlowLayout(FlowLayout.RIGHT));



        addSongButton.addActionListener(e -> {
                    cardLayout.show(mainPanel, ADD_SONG_VIEW);
                    addSongButton.setVisible(false);
                }
        );

        topBar.add(addSongButton);

        add(topBar, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);

        cardLayout.show(mainPanel, PLAYER_VIEW);

        setVisible(true);

    }
    private JPanel createAddSongPanel() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));

        JPanel form = new JPanel(new GridLayout(2, 2, 10, 10));

        titleField = new JTextField();
        authorField = new JTextField();

        form.add(new JLabel("Song title:"));
        form.add(titleField);

        form.add(new JLabel("Author:"));
        form.add(authorField);

        panel.add(form, BorderLayout.CENTER);

        // Save and Cancel buttons
        JPanel buttons = new JPanel(
                new FlowLayout(FlowLayout.RIGHT)
        );

        JButton saveButton = new JButton("Save");
        JButton cancelButton = new JButton("Cancel");

        saveButton.addActionListener(e -> {
            String title = titleField.getText().trim();
            String author = authorField.getText().trim();

            if (title.isEmpty() || author.isEmpty()) {
                JOptionPane.showMessageDialog(
                        this,
                        "Please enter both the title and author."
                );
                return;
            }

            controller.addSong(title, author);

            clearAddSongForm();
            cardLayout.show(mainPanel, PLAYER_VIEW);
        });

        cancelButton.addActionListener(e -> {
            clearAddSongForm();
            cardLayout.show(mainPanel, PLAYER_VIEW);
            addSongButton.setVisible(true);

        });

        buttons.add(saveButton);
        buttons.add(cancelButton);

        panel.add(buttons, BorderLayout.SOUTH);

        // Add some spacing around the form
        panel.setBorder(
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        return panel;
    }





    private JPanel createPlayerPanel() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));

        // Playlist

        playlist = new JList<>();
        playlist.setSelectionMode(
                ListSelectionModel.SINGLE_SELECTION
        );
        playlist.setSelectedIndex(0);


        panel.add(new JScrollPane(playlist), BorderLayout.NORTH);

        // Playback status
        playerState = new JLabel(
                "",
                SwingConstants.CENTER
        );
        playerState.setFont(new Font("Arial", Font.BOLD, 18));

        panel.add(playerState, BorderLayout.CENTER);

        // Playback controls
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

        panel.add(controls, BorderLayout.SOUTH);

        return panel;
    }

    private void clearAddSongForm() {
        titleField.setText("");
        authorField.setText("");
    }





    @Override
    public void update(Event event) {
        if (event instanceof PlaylistUpdatedEvent) {
            playlist.setListData(((PlaylistUpdatedEvent) event).getPlaylist().toArray(Song[]::new));
            playlist.setSelectedIndex(controller.getIdOfCurrentSong());
        } else if (event instanceof PlayerStateChangedEvent) {
            String newStatusBar = createNewStatusBar((PlayerStateChangedEvent) event);
            playerState.setText(newStatusBar);
            playlist.setSelectedIndex(controller.getIdOfCurrentSong());

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
