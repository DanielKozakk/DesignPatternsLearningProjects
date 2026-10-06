package duckReunion.model.duck;

import duckReunion.model.Quackable;
import duckReunion.observer.Observable;
import duckReunion.observer.QuackableObserver;

public class RedheadDuck implements Quackable {
    Observable observable;

    public RedheadDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Redhead Duck quacking");
        notifyObservers("Redhead Duck is sending message");

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
