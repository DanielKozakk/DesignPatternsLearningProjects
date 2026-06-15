package remoteControlSystem.command;

import remoteControlSystem.receiver.Light;

public abstract class Command {
    Light light;

    public Command(Light light) {
        this.light = light;
    }

    public abstract void execute();

    public abstract void undo();
}
