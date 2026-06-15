package remoteControlSystem.invoker;

import remoteControlSystem.command.Command;
import remoteControlSystem.command.LightOffCommand;
import remoteControlSystem.command.LightOnCommand;
import remoteControlSystem.receiver.Light;

import java.util.Stack;

public class RemoteControl {
    Stack<Command> commandHistory = new Stack<>();


    public void changeLight(boolean change){
       Light light = new Light();
       Command command = null;
        if(change){
            command = new LightOnCommand(light);
        } else{
           command = new LightOffCommand(light);
        }
        command.execute();
        commandHistory.push(command);
    }

    public void undo(){
        Command command = commandHistory.pop();
        command.undo();
    }
}
