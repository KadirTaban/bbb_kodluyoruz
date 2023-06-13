package patikadev.Entity;

import patikadev.Data.SeatData;

import java.util.List;

public abstract class AirCar {
    private long flightID;

    public long getFlightID() {
        return flightID;
    }

    public void setFlightID(long flightID) {
        this.flightID = flightID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public boolean isAbroad() {
        return isAbroad;
    }

    public void setAbroad(boolean abroad) {
        isAbroad = abroad;
    }

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
