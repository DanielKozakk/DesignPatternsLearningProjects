package bookExample.appliance.light;

import bookExample.appliance.Appliance;

public class CeilingLight extends Appliance implements Light {
    public CeilingLight(String name) {
        super(name);
    }

    @Override
    public void on() {
        System.out.println("Turned on Ceiling Light");
    }

    @Override
    public void off() {
        System.out.println("Turned off Ceiling Light");

    }
}
