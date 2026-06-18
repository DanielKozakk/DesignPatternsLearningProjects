package bookExample;

import bookExample.appliance.*;
import bookExample.appliance.light.CeilingLight;
import bookExample.appliance.light.GardenLight;
import bookExample.appliance.light.OutdoorLight;
import bookExample.command.Command;
import bookExample.command.OffCommand;
import bookExample.command.OnCommand;

import java.util.LinkedList;
import java.util.Stack;

public class ApplianceControl {


    private Command[] onCommands = new Command[7];
    private Command[] offCommands = new Command[7];


    Stack<Command> history = new Stack<>();

    public void setOnCommand(int slot, Command command) {
        onCommands[slot] = command;

    }

    public void setOffCommand(int slot, Command command) {
        offCommands[slot] = command;
    }

    public void pressOnButton(int id) {
        onCommands[id].execute();
        history.push(onCommands[id]);
    }

    public void pressOffButton(int id) {
        offCommands[id].execute();

        history.push(offCommands[id]);
    }

    public void undo() {
        Command command = history.pop();
        command.undo();
    }


}
