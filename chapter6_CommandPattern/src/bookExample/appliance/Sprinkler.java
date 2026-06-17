package bookExample.appliance;

public class Sprinkler extends Appliance{
    public Sprinkler(String name) {
        super(name);
    }

    @Override
    public void on() {
        System.out.println("Turned on Sprinkler");
    }

    @Override
    public void off() {
        System.out.println("Turned off Sprinkler");

    }
}
