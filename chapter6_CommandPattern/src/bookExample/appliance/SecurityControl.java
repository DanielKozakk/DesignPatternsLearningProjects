package bookExample.appliance;

public class SecurityControl extends Appliance{
    public SecurityControl(String name) {
        super(name);
    }

    @Override
    public void on() {
        System.out.println("Turned on Security Control");
    }

    @Override
    public void off() {
        System.out.println("Turned off Security Control");

    }
}
