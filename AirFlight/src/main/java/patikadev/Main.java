package patikadev;

import patikadev.Data.SeatData;
import patikadev.Entity.PEGASUS;
import patikadev.Entity.Seat;
import patikadev.Entity.THY;
import patikadev.Service.THYServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        THY thy = new THY(2,"Pegasus",true);
        THYServiceImpl thyService = new THYServiceImpl(thy);

        thyService.getAvailableSeats().stream()
                .forEach(seat -> System.out.println(seat.name));
    }
}