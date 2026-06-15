package taskScheduler;

import taskScheduler.command.Command;

import java.util.LinkedList;
import java.util.Queue;

import static java.lang.Thread.sleep;

public class TaskScheduler {
    Queue<Command> commandsQueue = new LinkedList<>();

    public void addCommand(Command command) {
        commandsQueue.add(command);
    }

    public void executeCommands() throws InterruptedException {
        while(!commandsQueue.isEmpty()){
            Command command = commandsQueue.poll();
            command.execute();
            sleep(1000);
        }
    }
}
