package org.example.secondWeek.entity;


import org.example.secondWeek.data.SeatData;

import java.util.ArrayList;
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

    public AirCar(String seatName, boolean abroad, boolean hasMeal, boolean empty) {
    }

    public List<Seat> getAvailableSeats() {
        List<Seat> availableSeats = new ArrayList<>();
        for (Seat seat : this.seatData) {
            if (seat.getEmpty()) {
                availableSeats.add(seat);
            }
        }
        return availableSeats;
    }

}
