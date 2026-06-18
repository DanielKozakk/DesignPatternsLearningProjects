import bookExample.ApplianceControl;
import bookExample.appliance.Appliance;
import bookExample.appliance.GarageDoor;
import bookExample.command.Command;
import bookExample.command.OffCommand;
import bookExample.command.OnCommand;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws InterruptedException {

    ApplianceControl applianceControl = new ApplianceControl();

    Appliance garageDoor = new GarageDoor("Garage Door");
    Command openGarageDoor = new OnCommand(garageDoor);
    Command closeGarageDoor = new OffCommand(garageDoor);

    applianceControl.setOnCommand(0, openGarageDoor);
    applianceControl.setOffCommand(0, closeGarageDoor);

    applianceControl.pressOnButton(0);
    applianceControl.undo();

}
