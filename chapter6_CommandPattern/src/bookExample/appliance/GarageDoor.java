package bookExample.appliance;

public class GarageDoor extends Appliance{
    public GarageDoor(String name) {
        super(name);
    }

    @Override
    public void on() {
        System.out.println("Turned on Garage Door");
    }

    @Override
    public void off() {
        System.out.println("Turned off Garage Door");

    }
}
