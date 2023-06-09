package org.example.entities;

public class HatchbackCar extends Car {
    public HatchbackCar(String color, String luggageCapacity, RentType rentType, CarType carType, int age) {
        super(color, luggageCapacity, RentType.DAILY, CarType.HATCHBACK, age);
    }
}
