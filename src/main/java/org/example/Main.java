package org.example;


import org.example.secondWeek.Entity.PEGASUS;
import org.example.secondWeek.Entity.THY;
import org.example.secondWeek.Service.AirCarServiceImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AirCarServiceImpl airService = new AirCarServiceImpl();
        Scanner scanner = new Scanner(System.in);
        THY thy = new THY(2,"THY",true);
        PEGASUS pegasus = new PEGASUS(2,"Pegasus",false);
        String sideNumber = new String();
        int airlineChoice;
        while (true) {
            System.out.println("Please enter your seat side number (or 'q' to quit): ");
            sideNumber = scanner.nextLine();

            if (sideNumber.equals("q")) {
                break;
            }

            System.out.println("Please choose an airline (1 for THY, 2 for PEGASUS): ");
            airlineChoice = scanner.nextInt();
            scanner.nextLine();

            switch (airlineChoice) {
                case 1:
                    airService.buyTicket(sideNumber, thy);
                    airService.getSeatName(thy);
                    break;
                case 2:
                    airService.buyTicket(sideNumber, pegasus);
                    airService.getSeatName(pegasus);
                    break;
                default:
                    System.out.println("Invalid airline choice!");
                    break;
            }
        }
    }
}


