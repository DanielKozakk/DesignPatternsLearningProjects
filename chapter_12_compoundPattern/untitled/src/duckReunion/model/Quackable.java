package duckReunion.model;

import duckReunion.observer.QuackableSubject;

public interface Quackable extends QuackableSubject {
     void quack();
}
