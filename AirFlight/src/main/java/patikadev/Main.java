package patikadev;

import patikadev.Data.SeatData;
import patikadev.Entity.AirCar;
import patikadev.Entity.PEGASUS;
import patikadev.Entity.Seat;
import patikadev.Entity.THY;
import patikadev.Service.AirCarServiceImpl;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AirCarServiceImpl airService = new AirCarServiceImpl();
        Scanner scanner = new Scanner(System.in);
        THY thy = new THY(2,"THY",true);
        PEGASUS pegasus = new PEGASUS(2,"Pegasus",false);
        String sideNumber = new String();
        while (true) {
            System.out.println("Please enter your seat side number (or 'q' to quit): ");
            sideNumber = scanner.nextLine();

            if (sideNumber.equals("q")) {
                break;
            }

            System.out.println("Please choose an airline (1 for THY, 2 for PEGASUS): ");
            int airlineChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

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


