package patikadev.Service;

import patikadev.Data.SeatData;
import patikadev.Entity.Seat;
import patikadev.Entity.THY;

import java.util.ArrayList;
import java.util.List;

public class THYServiceImpl {

    private THY thy;
    private Seat seat;

    public THYServiceImpl(THY thy){
        this.thy = thy;

        }


    public List<Seat> getAvailableSeats() {
        List<Seat> availableSeats = new ArrayList<>();
        for (Seat seat : thy.seatData) {
            if (seat.getEmpty()) {
                availableSeats.add(seat);
            }
        }
        return availableSeats;
    }
    }




