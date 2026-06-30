package ownImplementation.adapter;

import ownImplementation.clientInterface.SquareMeter;
import ownImplementation.service.SquareLegacyCounterService;

public class SquareMeterAdapter extends SquareMeter {


    SquareLegacyCounterService legacyCounterService;
    double width;
    double length;

    public SquareMeterAdapter(SquareLegacyCounterService legacyCounterService, double width, double length) {
        this.legacyCounterService = legacyCounterService;
        this.length = length;
        this.width = width;
    }

    @Override
    public double getSquareMeter() {

        return legacyCounterService.countSquareMeters( (int) width, (int) length);
    }
}
