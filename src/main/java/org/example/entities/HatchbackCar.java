package org.example.entities;

import org.example.entities.enums.CarType;
import org.example.entities.enums.RentType;

public class HatchbackCar extends Car {
    public HatchbackCar(String color, String luggageCapacity, RentType rentType, CarType carType, int age) {
        super(color, luggageCapacity, rentType, carType, age);
    }
}
