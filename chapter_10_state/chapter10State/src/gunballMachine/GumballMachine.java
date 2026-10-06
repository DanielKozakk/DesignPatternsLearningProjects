package gunballMachine;

import gunballMachine.state.State;

public class GumballMachine {
    State state;

    public GumballMachine(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
