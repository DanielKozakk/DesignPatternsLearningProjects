package mvc.model.observer;


import mvc.model.observer.event.Event;


public interface Observer {
    void update(Event event);
}
