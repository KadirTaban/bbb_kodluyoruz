package org.example.services;

import org.example.entities.*;
import org.example.entities.enums.CarType;
import org.example.entities.enums.ConsumerType;
import org.example.entities.enums.RentType;
import org.example.services.abstracts.CarRentService;

import java.util.Scanner;

public class CarRentServiceImpl implements CarRentService {
    Scanner input = new Scanner(System.in);

    public boolean isCivilAndHatchback(Consumer consumer,Car car){
        if(consumer.authType.equals(ConsumerType.Civil)){
            if(car.carType.equals(CarType.HATCHBACK)){
                return true;
            }
        }
        return false;
    }

    public boolean isSedan(Car car){
        if(!car.carType.equals(CarType.SEDAN)){
            return false;
        }
        return true;
    }

    public boolean isSuv(Car car){
        if(!car.carType.equals(CarType.SUV)){
            return false;
        }
        return true;
    }

    public boolean isNotCivil(Consumer consumer){
        if(consumer.authType.equals(ConsumerType.Civil)) {
            return false;
        }
        return true;
    }

    public String RentACar(Consumer consumer, Car car, RentType rentType){
        if(isCivilAndHatchback(consumer,car) && rentType.equals(RentType.DAILY)){
            HatchbackCar hatchbackCar = (HatchbackCar) car; //downcasting
            System.out.println("Aracın günlük kirasını giriniz");
            int value = input.nextInt();
            return hatchbackCar.color+" renkte "+hatchbackCar.age+" yasinda "+hatchbackCar.carType+" araç "+hatchbackCar.rentType + " " + setPrice(value,car)+"tl ye kiralanmıstır";
        }
        if (isSuv(car) && isNotCivil(consumer)){
            SuvCar suvCar = (SuvCar) car;
            System.out.println("Aracın "+ car.rentType+ " kirasını giriniz");
            int value = input.nextInt();
            return suvCar.color+" renkte "+suvCar.age+" yasinda "+suvCar.carType+" araç "+suvCar.rentType + " " + setPrice(value,car)+"tl ye kiralanmıstır";
        }
        if(isSedan(car) && isNotCivil(consumer)){
            SedanCar sedanCar = (SedanCar) car;
            System.out.println("Aracın "+ car.rentType+ " kirasını giriniz");
            int value = input.nextInt();
            return sedanCar.color+" renkte "+sedanCar.age+" yasinda "+sedanCar.carType+" araç "+sedanCar.rentType + " " + setPrice(value,car)+" tl ye kiralanmıstır";
        }
        return "baska bir opsiyon deneyiniz";
    }

    @Override
    public int rentDaily(Car car, int value) {
        car.setDailyPrice(value);
        return value;
    }

    @Override
    public int rentMonthly(Car car, int value) {
        car.setMonthlyPrice(value);
        return value;
    }

    @Override
    public int rentWeekly(Car car, int value) {
        car.setWeeklyPrice(value);
        return value;
    }

    public int setPrice(int value, Car car){
        int price = car.rentType.equals(RentType.DAILY) ? rentDaily(car,value) :
                car.rentType.equals(RentType.MONTHLY) ? rentMonthly(car,value) :
                        car.rentType.equals(RentType.WEEKLY) ? rentWeekly(car,value) :
                                0;
        return price;
    }
}
