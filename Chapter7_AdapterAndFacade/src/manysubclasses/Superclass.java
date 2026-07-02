package manysubclasses;

public class Superclass {

    protected String name;

    public Superclass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }
}
