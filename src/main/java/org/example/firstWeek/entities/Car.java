package org.example.firstWeek.entities;

import org.example.firstWeek.entities.enums.CarType;
import org.example.firstWeek.entities.enums.RentType;

public abstract class Car {
    public String color,luggageCapacity;
    public RentType rentType;
    public CarType carType;
    public int age ;
    private int dailyPrice;
    private int weeklyPrice;
    private int monthlyPrice;

    public Car(String color, String luggageCapacity,RentType rentType, CarType carType, int age){

        this.color = color;
        this.luggageCapacity = luggageCapacity;
        this.rentType = rentType;
        this.carType = carType;
        this.age = age;

    }

    public void setDailyPrice(int dailyPrice) {
        this.dailyPrice = dailyPrice;
    }


    public void setWeeklyPrice(int weeklyPrice) {
        this.weeklyPrice = weeklyPrice;
    }


    public void setMonthlyPrice(int monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }


}
