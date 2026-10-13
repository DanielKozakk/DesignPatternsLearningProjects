package mvc.model.observer;

import mvc.model.observer.event.Event;


public interface Observable {
    void notifyObservers(Event event);
    void subscribe(Observer observer);


}
