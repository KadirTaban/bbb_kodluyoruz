package org.example.services.abstracts;

import org.example.entities.Car;

public interface CarRentService {
    public int rentDaily(Car car, int value);
    public int rentMonthly(Car car, int value);
    public int rentWeekly(Car car,int value);



}
