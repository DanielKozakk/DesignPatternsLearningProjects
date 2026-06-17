package bookExample.command;

import bookExample.appliance.Appliance;

public class OffCommand implements Command {

    Appliance appliance;

    public OffCommand(Appliance appliance) {
        this.appliance = appliance;
    }

    @Override
    public void execute() {
        System.out.println("turning off of appliance: " + appliance.getName());
        appliance.off();
    }

    @Override
    public void undo() {
        System.out.println("undoing turning off of appliance: " + appliance.getName());
        appliance.on();
    }
}
