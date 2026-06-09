package editor;

import editor.command.CommandHistory;

import java.util.ArrayList;
import java.util.List;

public class Application {

    private String clipboard;
    private List<Editor> editors = new ArrayList<>();
    private Editor activeEditor;
    private CommandHistory history;

    public String getClipboard() {
        return clipboard;
    }

    public void setClipboard(String clipboard) {
        this.clipboard = clipboard;
    }
}
