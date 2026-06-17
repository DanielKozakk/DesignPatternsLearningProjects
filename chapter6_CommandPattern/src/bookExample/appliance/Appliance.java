package bookExample.appliance;

public abstract class Appliance {
    private final String name;

    public abstract void on();
    public abstract void off();

    public Appliance(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
