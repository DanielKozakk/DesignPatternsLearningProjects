package bookExample.appliance.thermostat;

import bookExample.appliance.Appliance;

public class Hottub extends Appliance implements Thermostat {
    public Hottub(String name) {
        super(name);
    }

    @Override
    public void on() {
        System.out.println("Turned on Hottub");
    }

    @Override
    public void off() {
        System.out.println("Turned off hottub");

    }

    @Override
    public void setTemperature() {

    }
}
