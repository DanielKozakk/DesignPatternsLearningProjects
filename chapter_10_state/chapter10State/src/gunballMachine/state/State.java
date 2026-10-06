package gunballMachine.state;

import gunballMachine.GumballMachine;

public abstract class State {

    GumballMachine gumballMachine;

    public State(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    abstract void insertQuarter();

    abstract void ejectQuarter();

    abstract void turnCrank();

    abstract void dispense();
}
