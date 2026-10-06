package duckReunion.observer;

public interface QuackableSubject {
    void subscribe(QuackableObserver quackableObserver);
    void notifyObservers(String message);

}
