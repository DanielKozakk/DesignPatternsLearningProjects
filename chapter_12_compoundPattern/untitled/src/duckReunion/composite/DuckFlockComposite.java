package duckReunion.composite;

import duckReunion.model.Quackable;
import duckReunion.observer.Observable;
import duckReunion.observer.QuackableObserver;

import java.util.List;

public class DuckFlockComposite implements Quackable{

    List<Quackable> quackableList;

    Observable observable;


    public DuckFlockComposite(List<Quackable> quackableList) {
        this.quackableList = quackableList;
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {

        for(Quackable member: quackableList){
            member.quack();
        }
    }

    @Override
    public void subscribe(QuackableObserver quackableObserver) {
        for(Quackable quackable : quackableList){
            quackable.subscribe(quackableObserver);
        }

    }

    @Override
    public void notifyObservers(String message) {
        for(Quackable quackable: quackableList){
            quackable.notifyObservers(message);
        }
    }
}
