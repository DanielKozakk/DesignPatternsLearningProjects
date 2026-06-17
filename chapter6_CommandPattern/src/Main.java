import bookExample.ApplianceControl;
import bookExample.appliance.Appliance;
import bookExample.appliance.CeilingFan;
import editor.Editor;
import remoteControlSystem.invoker.RemoteControl;
import taskScheduler.TaskScheduler;
import taskScheduler.command.Command;
import taskScheduler.command.SendEmailCommand;
import taskScheduler.domain.EmailSender;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws InterruptedException {

    ApplianceControl applianceControl = new ApplianceControl();

    applianceControl.changeApplianceState(3, true);


    applianceControl.changeApplianceState(2, true);


}
