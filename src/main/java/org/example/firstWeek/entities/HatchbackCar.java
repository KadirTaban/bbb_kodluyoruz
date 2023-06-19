package org.example.firstWeek.entities;

import org.example.firstWeek.entities.enums.CarType;
import org.example.firstWeek.entities.enums.RentType;

public class HatchbackCar extends Car {
    public HatchbackCar(String color, String luggageCapacity, RentType rentType, CarType carType, int age) {
        super(color, luggageCapacity, rentType, carType, age);
    }
}
