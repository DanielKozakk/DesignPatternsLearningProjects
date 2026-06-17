package bookExample.appliance.light;

import bookExample.appliance.Appliance;

public class OutdoorLight extends Appliance implements Light {
    public OutdoorLight(String name) {
        super(name);
    }

    @Override
    public void on() {
        System.out.println("Turned on Outdoor Light");
    }

    @Override
    public void off() {
        System.out.println("Turned off Outdoor Light");

    }
}
