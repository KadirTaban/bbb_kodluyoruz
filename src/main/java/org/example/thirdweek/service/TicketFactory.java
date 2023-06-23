package org.example.thirdweek.service;
import org.example.thirdweek.entity.Ticket;
import org.example.thirdweek.enums.CompanyName;


public class TicketFactory {

    public static Ticket createTicket(Long id, CompanyName companyName, String seatName, Boolean isAbroad, Boolean hasMeal, Boolean isEmpty) {
        switch (companyName) {
            case THY:
                return new Ticket(id,seatName, isAbroad, hasMeal, isEmpty, companyName);
            case ONUR_AIR:
                return new Ticket(id,seatName, isAbroad, hasMeal, isEmpty, companyName);
            case PEGASUS:
                return new Ticket(id,seatName, isAbroad, hasMeal, isEmpty, companyName);
            default:
                throw new IllegalArgumentException("Invalid company name: " + companyName);
        }
    }
}
