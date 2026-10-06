package duckReunion.abstractFactory;

import duckReunion.countingDecorator.QuackCountingDecorator;
import duckReunion.model.duck.*;
import duckReunion.model.Quackable;

public class CountingDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackCountingDecorator(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCountingDecorator(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCountingDecorator(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCountingDecorator(new RubberDuck());
    }

    @Override
    public Quackable createGregariousDuck() {
        return new QuackCountingDecorator(new GregariousDuck());
    }
}
