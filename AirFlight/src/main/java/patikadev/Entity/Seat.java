package patikadev.Entity;

import java.util.ArrayList;
import java.util.List;

public class Seat {
    public String name;
    public boolean isEmpty;

    public Seat(String name, boolean isEmpty){
        this.name=name;
        this.isEmpty=isEmpty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getEmpty() {
        return this.isEmpty;
    }
    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public List<Seat> getAvailableSeats(List<Seat> seatData) {
        List<Seat> availableSeats = new ArrayList<>();
        for (Seat seat : seatData) {
            if (seat.getEmpty()) {
                availableSeats.add(seat);
            }
        }
        return availableSeats;
    }


}
