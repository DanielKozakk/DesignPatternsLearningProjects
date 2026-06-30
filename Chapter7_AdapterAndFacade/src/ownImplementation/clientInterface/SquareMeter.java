package ownImplementation.clientInterface;

public class SquareMeter {
    double squareMeter;

    public SquareMeter(double width, double length) {
        this.squareMeter = width * length;
    }

    public SquareMeter(double squareMeter) {
        this.squareMeter = squareMeter;
    }

    public SquareMeter() {
    }

    public void setSquareMeter(double squareMeter) {
        this.squareMeter = squareMeter;
    }

    public double getSquareMeter() {
        return squareMeter;
    }
}
