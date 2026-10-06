package gunballMachine.state;

import gunballMachine.GumballMachine;

public class NoQuarterState extends State{
    public NoQuarterState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertQuarter() {


    }

    @Override
    public void ejectQuarter() {
    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}
