package bookExample.appliance;

public class Stereo extends Appliance{
    public Stereo(String name) {
        super(name);
    }

    @Override
    public void on() {
        System.out.println("Turned on Stereo");
    }

    @Override
    public void off() {
        System.out.println("Turned off Stereo");

    }
}
