package bookExample.appliance;

public class FaucetControl extends Appliance{
    public FaucetControl(String name) {
        super(name);
    }

    @Override
    public void on() {
        System.out.println("Turned on Faucet Control");
    }

    @Override
    public void off() {
        System.out.println("Turned off Faucet Control");

    }
}
