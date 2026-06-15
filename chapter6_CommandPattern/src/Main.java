import editor.Editor;
import remoteControlSystem.invoker.RemoteControl;
import taskScheduler.TaskScheduler;
import taskScheduler.command.Command;
import taskScheduler.command.SendEmailCommand;
import taskScheduler.domain.EmailSender;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws InterruptedException {

    TaskScheduler taskScheduler = new TaskScheduler();
    EmailSender emailSender = new EmailSender();
    Command sendEmailCommand = new SendEmailCommand(emailSender, "first email");
    Command sendEmailCommand2 = new SendEmailCommand(emailSender, "second email");
    Command sendEmailCommand3 = new SendEmailCommand(emailSender, "third email");

    taskScheduler.addCommand(sendEmailCommand);
    taskScheduler.addCommand(sendEmailCommand2);
    taskScheduler.addCommand(sendEmailCommand3);

    taskScheduler.executeCommands();




}
