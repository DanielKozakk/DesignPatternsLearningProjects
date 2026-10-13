package mvc.model;

public class Song {
    private static int availableId = 0;

    private int id;
    private String name;
    private String author;

    public Song( String name, String author) {
        this.name = name;
        this.author = author;
        this.id = availableId;
        availableId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return name + " - " + author;
    }
}
