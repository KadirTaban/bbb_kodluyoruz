package org.example.firstWeek.entities;

import org.example.firstWeek.entities.enums.CarType;
import org.example.firstWeek.entities.enums.RentType;

public class SuvCar extends Car {

    public SuvCar(String color, String luggageCapacity, RentType rentType, CarType carType, int age) {
        super(color, luggageCapacity, rentType, carType, age);
    }
}
