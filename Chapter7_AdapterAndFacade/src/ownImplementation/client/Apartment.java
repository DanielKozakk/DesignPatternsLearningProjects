package ownImplementation.client;

import ownImplementation.clientInterface.SquareMeter;

public class Apartment {

    public SquareMeter squareMeter;

    public Apartment(SquareMeter squareMeter) {
        this.squareMeter = squareMeter;
    }

    public boolean isApartmentLarge(){
        return squareMeter.getSquareMeter() > 100;
    }
}
