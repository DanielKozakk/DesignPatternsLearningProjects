package duckReunion.observer;

public class Observer implements QuackableObserver{


    String name;

    public Observer(String name) {
        this.name = name;
    }

    @Override
    public void notifyQuackableObserver(String message) {

        System.out.println(name + " was notified with: " + message);

    }
}
