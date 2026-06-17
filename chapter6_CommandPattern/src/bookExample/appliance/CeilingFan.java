package bookExample.appliance;

public class CeilingFan extends Appliance{
    public CeilingFan(String name) {
        super(name);
    }

    @Override
    public void on() {
        System.out.println("Turned on Ceiling Fan");
    }

    @Override
    public void off() {
        System.out.println("Turned off Ceiling Fan");

    }
}
