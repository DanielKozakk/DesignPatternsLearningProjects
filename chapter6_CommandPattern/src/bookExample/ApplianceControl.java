package bookExample;

import bookExample.appliance.*;
import bookExample.appliance.light.CeilingLight;
import bookExample.appliance.light.GardenLight;
import bookExample.appliance.light.OutdoorLight;
import bookExample.command.Command;
import bookExample.command.OffCommand;
import bookExample.command.OnCommand;

import java.util.LinkedList;
import java.util.Stack;

public class ApplianceControl {

    Appliance[] appliances = {
            new CeilingFan("Ceiling Fan"),
            new CeilingLight("Ceiling Light"),
            new OutdoorLight("Outdoor Light"),
            new GardenLight("Garden Light"),
            new Sprinkler("Sprinkler"),
            new GarageDoor("Garage Door"),
            new TV("TV"),
            new Stereo("Stereo"),
            new FaucetControl("Faucet Control"),
            new SecurityControl("Security Control")
    };

    Stack<Command> history = new Stack<>();

    public void setNewAppliance(int slotId, Appliance appliance){
        appliances[slotId] = appliance;
    }



    public void changeApplianceState(int applianceId, boolean state){
        Command command;
        Appliance appliance = appliances[applianceId];
        if(state){
            command = new OnCommand(appliance);
        } else{
            command = new OffCommand(appliance);
        }

        command.execute();
        history.push(command);
    }

    public void undo(){
        Command command = history.pop();
        command.undo();
    }


}
