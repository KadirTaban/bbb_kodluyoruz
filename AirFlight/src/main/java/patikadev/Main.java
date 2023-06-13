package patikadev;

import patikadev.Data.SeatData;
import patikadev.Entity.PEGASUS;
import patikadev.Entity.Seat;
import patikadev.Entity.THY;
import patikadev.Service.THYServiceImpl;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        THY thy = new THY(2,"Pegasus",true);
        THYServiceImpl thyService = new THYServiceImpl(thy);
        System.out.println("please enter your seat side number : ");
        String sideNumber = scanner.nextLine();
        thyService.buyTicket(sideNumber);

        thyService.getSeatName();


    }

}