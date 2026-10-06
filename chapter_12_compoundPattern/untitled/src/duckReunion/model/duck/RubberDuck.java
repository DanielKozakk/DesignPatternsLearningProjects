package duckReunion.model.duck;

import duckReunion.model.Quackable;
import duckReunion.observer.Observable;
import duckReunion.observer.QuackableObserver;

public class RubberDuck implements Quackable {

    Observable observable;

    public RubberDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Rubber Duck quacking");
        notifyObservers("Rubber Duck is sending a message");
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
