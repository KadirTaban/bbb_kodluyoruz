package patikadev.Entity;

import patikadev.Data.SeatData;

import java.util.List;

public abstract class AirCar {
    private long flightID;
    protected String brandName;
    protected boolean isAbroad;

    public List<Seat> seatData;
    public AirCar(long flightID, String brandName, boolean isAbroad) {
        this.flightID = flightID;
        this.brandName = brandName;
        this.isAbroad = isAbroad;
        this.seatData = new SeatData().getSeats();
    }
}
