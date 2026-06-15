package taskScheduler.command;

import taskScheduler.domain.EmailSender;

public class SendEmailCommand implements Command {
    EmailSender emailSender;
    String text;

    public SendEmailCommand( EmailSender emailSender, String emailText) {
        this.emailSender = emailSender;
        this.text = emailText;

    }

    @Override
    public void execute() {

        System.out.println("executing sendEmailCommand");
        emailSender.sendEmail(text);
    }
}
