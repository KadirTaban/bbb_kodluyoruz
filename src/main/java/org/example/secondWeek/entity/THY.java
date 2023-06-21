package org.example.secondWeek.entity;


import org.example.thirdweek.enums.CompanyName;

public class THY extends AirCar{


    public THY(long flightID, String brandName, boolean isAbroad) {
        super(flightID, brandName, isAbroad);
    }

    public THY(String seatName, boolean abroad, boolean hasMeal, boolean empty) {
        super(seatName, abroad, hasMeal, empty);
    }
}
