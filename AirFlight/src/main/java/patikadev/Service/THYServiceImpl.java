package patikadev.Service;

import patikadev.Entity.AirCar;
import patikadev.Entity.Seat;

import java.util.ArrayList;
import java.util.List;

public class THYServiceImpl {

    private AirCar airCar;
    private Seat seat;

    public THYServiceImpl(AirCar airCar) {
        this.airCar = airCar ;
    }


    public List<Seat> getAvailableSeats() {
        List<Seat> availableSeats = new ArrayList<>();
        for (Seat seat : airCar.seatData) {
            if (seat.getEmpty()) {
                availableSeats.add(seat);
            }
        }
        return availableSeats;
    }

    public AirCar buyTicket(String ticketName) {
        for (Seat seat : airCar.seatData) {
            if (seat.name.equals(ticketName)) {
                seat.isEmpty = false;
            }
        }

        return this.airCar;
    }
    public void getSeatName() {
        List<Seat> seats = getAvailableSeats();
        seats.stream().forEach(seat -> System.out.println(seat.name));

    }

    public boolean giveMeal(){
        if(airCar.isAbroad()){
            return true;
        }
        return false;
    }

}




