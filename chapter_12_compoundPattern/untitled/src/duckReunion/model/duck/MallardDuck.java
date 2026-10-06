package duckReunion.model.duck;

import duckReunion.model.Quackable;
import duckReunion.observer.Observable;
import duckReunion.observer.QuackableObserver;
import duckReunion.observer.QuackableSubject;

import java.util.ArrayList;
import java.util.List;

public class MallardDuck implements Quackable {

    Observable observable;

    public MallardDuck(){
        observable = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("Mallard Duck quacking");
        notifyObservers("Mallard Duck is sending a message");

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
