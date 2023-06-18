package patikadev.Service;

import patikadev.Entity.AirCar;
import patikadev.Entity.Seat;
import java.util.List;

public class AirCarServiceImpl {

    public AirCar buyTicket(String ticketName,AirCar airCar) {
        for (Seat seat : airCar.seatData) {
            if (seat.name.equals(ticketName)) {
                if (seat.isEmpty) {
                    seat.isEmpty = false;
                    break;
                } else {
                    throw new IllegalStateException("Bu koltuk dolu, başka bir seçenek seçiniz.");
                }
            }
        }

        return airCar;
    }

    public void getSeatName(AirCar airCar) {
        List<Seat> seats = airCar.getAvailableSeats();
        System.out.println("Kalan koltuklar");
        seats.stream().forEach(seat -> System.out.print(" "+seat.name));

    }


}




