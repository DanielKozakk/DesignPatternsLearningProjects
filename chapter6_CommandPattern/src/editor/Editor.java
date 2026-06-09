package editor;

public class Editor {
    public String text;

    public String getSelection() {
        return text;
    }

    public void replaceSelection(String text) {
        this.text = text;
    }

    public void removeSelection(){
        text = "";
    }
}
