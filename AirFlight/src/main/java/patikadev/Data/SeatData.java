package patikadev.Data;

import patikadev.Entity.Seat;

import java.util.ArrayList;
import java.util.List;

public class SeatData {

    private List<Seat> seats;

    public SeatData() {
        this.seats = new ArrayList<>();
        this.seats.add(new Seat("A1", true));
        this.seats.add(new Seat("A2", true));
        this.seats.add(new Seat("A3", true));
        this.seats.add(new Seat("B1", true));
        this.seats.add(new Seat("B2", true));
        this.seats.add(new Seat("B3", true));
        this.seats.add(new Seat("C1", true));
        this.seats.add(new Seat("C2", true));
        this.seats.add(new Seat("C3", true));
        this.seats.add(new Seat("D1", true));
        this.seats.add(new Seat("D2", true));
        this.seats.add(new Seat("D3", true));
    }
    public List<Seat> getSeats() {
        return this.seats;
    }



}
