package bookExample.appliance.light;

import bookExample.appliance.Appliance;

public class GardenLight extends Appliance implements Light {
    public GardenLight(String name) {
        super(name);
    }

    @Override
    public void on() {
        System.out.println("Turned on Garden Light");
    }

    @Override
    public void off() {
        System.out.println("Turned off Garden Light");

    }
}
