package org.example;

import org.example.entities.*;
import org.example.services.CarRentServiceImpl;

public class Main extends CarRentServiceImpl {
    public static void main(String[] args) {
        CarRentServiceImpl rentService = new CarRentServiceImpl();

        Consumer consumer = new Consumer("Ali", ConsumerType.Civil);
        Consumer consumer_2 = new Consumer("Koza", ConsumerType.Company);

        SuvCar suv = new SuvCar("blue","230lt", RentType.DAILY, CarType.SUV,12);
        SuvCar suv2 = new SuvCar("blue","230lt", RentType.MONTHLY, CarType.SUV,12);

        HatchbackCar hatchbackCar = new HatchbackCar("red","340lt",RentType.DAILY,CarType.HATCHBACK,11);
        HatchbackCar hatchbackCar1 = new HatchbackCar("purple","475lt",RentType.MONTHLY,CarType.HATCHBACK,10);

        SedanCar sedanCar = new SedanCar("orange","340lt",RentType.WEEKLY,CarType.SEDAN,12);
        SedanCar sedanCar_2 = new SedanCar("orange","340lt",RentType.MONTHLY,CarType.SEDAN,12);

        System.out.println(rentService.RentACar(consumer,hatchbackCar,hatchbackCar.rentType));
    }
}