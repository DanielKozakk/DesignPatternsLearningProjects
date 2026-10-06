package duckReunion.countingDecorator;

import duckReunion.model.Quackable;
import duckReunion.observer.Observable;
import duckReunion.observer.QuackableObserver;

public class QuackCountingDecorator implements Quackable {
    Quackable quackable;

    private static int count = 0;



    public QuackCountingDecorator(Quackable quackable) {
        this.quackable = quackable;

    }

    @Override
    public void quack() {
        quackable.quack();
        count ++;

    }

    public static int getCount() {
        return count;
    }


    @Override
    public void subscribe(QuackableObserver quackableObserver) {
        quackable.subscribe(quackableObserver);

    }

    @Override
    public void notifyObservers(String message) {
        quackable.notifyObservers(message);
    }

}
