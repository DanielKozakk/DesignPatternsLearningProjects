package duckReunion.model.duck;

import duckReunion.model.Quackable;
import duckReunion.observer.Observable;
import duckReunion.observer.QuackableObserver;

public class DuckCall implements Quackable {

    Observable observable;

    public DuckCall() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Duck Call quacking");
        notifyObservers("Duck Call is sending message");
    }


    @Override
    public void subscribe(QuackableObserver quackableObserver) {
        observable.subscribe(quackableObserver);
    }

    @Override
    public void notifyObservers(String message) {
        observable.notifyObservers(message);
    }
}
