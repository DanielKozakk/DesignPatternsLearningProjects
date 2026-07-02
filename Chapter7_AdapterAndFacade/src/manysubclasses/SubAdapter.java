package manysubclasses;

public class SubAdapter extends Superclass{

    Superclass adaptee;

    public SubAdapter(String name, Superclass adaptee) {
        super(name);
        this.adaptee = adaptee;
    }

    public void addedFunctionality(String newName){
        adaptee.setName(newName);
    }
}
