package bookExample.appliance;

public class TV extends Appliance{
    public TV(String name) {
        super(name);
    }

    @Override
    public void on() {
        System.out.println("Turned on TV");
    }

    @Override
    public void off() {
        System.out.println("Turned off TV ");

    }
}
