package bookExample.command;

import bookExample.appliance.Appliance;

public class OnCommand implements Command {

    Appliance appliance;

    public OnCommand(Appliance appliance) {
        this.appliance = appliance;
    }

    @Override
    public void execute() {
        System.out.println("turning on of appliance: " + appliance.getName());
        appliance.on();
    }

    @Override
    public void undo() {
        System.out.println("undoing turning on of appliance: " + appliance.getName());
        appliance.off();
    }
}
