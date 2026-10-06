package duckReunion.model.duck;

import duckReunion.model.Quackable;
import duckReunion.observer.Observable;
import duckReunion.observer.QuackableObserver;

public class GregariousDuck implements Quackable {
    Observable observable;

    public GregariousDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Gregarious Duck quacking");
        notifyObservers("Gregarious Duck is sending a message");
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
