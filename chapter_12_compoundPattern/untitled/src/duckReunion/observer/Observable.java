package duckReunion.observer;

import java.util.ArrayList;
import java.util.List;

public class Observable implements QuackableSubject {

    List<QuackableObserver> observers = new ArrayList<>();
    QuackableSubject duck;

    public Observable(QuackableSubject duck) {
        this.duck = duck;
    }

    @Override
    public void subscribe(QuackableObserver quackableObserver) {
        observers.add(quackableObserver);


    }

    @Override
    public void notifyObservers(String message) {

        for(QuackableObserver observer: observers){
            observer.notifyQuackableObserver(message);
        }
    }
}
