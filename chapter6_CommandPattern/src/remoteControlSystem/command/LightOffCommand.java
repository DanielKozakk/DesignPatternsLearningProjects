package remoteControlSystem.command;

import remoteControlSystem.receiver.Light;

public class LightOffCommand extends Command {
    public LightOffCommand(Light light) {
        super(light);
    }

    @Override
    public void execute() {
       System.out.println("Command is turning off light");
       light.turnOff();
    }

    @Override
    public void undo() {
        System.out.println("Command is undoing: turning on light");
        light.turnOn();
    }
}
