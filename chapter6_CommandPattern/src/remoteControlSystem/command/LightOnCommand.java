package remoteControlSystem.command;

import remoteControlSystem.receiver.Light;

public class LightOnCommand extends Command {
    public LightOnCommand(Light light) {
        super(light);
    }

    @Override
    public void execute() {
       System.out.println("Command is turning on light");
       light.turnOn();
    }

    @Override
    public void undo() {
        System.out.println("Command is undoing: turning off light");
        light.turnOff();
    }
}
