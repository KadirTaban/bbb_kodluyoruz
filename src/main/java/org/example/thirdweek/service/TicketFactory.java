package org.example.thirdweek.service;

import org.example.thirdweek.entity.OnurAir;
import org.example.thirdweek.entity.Pegasus;
import org.example.thirdweek.entity.THY;
import org.example.thirdweek.entity.Ticket;
import org.example.thirdweek.enums.CompanyName;


public interface TicketFactory {
    public static Ticket createTicket(CompanyName companyName, String seatName, boolean isAbroad, boolean hasMeal, boolean isEmpty) {
        switch (companyName) {
            case THY:
                return new THY(seatName, isAbroad, hasMeal, isEmpty, companyName);
            case ONUR_AIR:
                return new OnurAir(seatName, isAbroad, hasMeal, isEmpty, companyName);
            case PEGASUS:
                return new Pegasus(seatName, isAbroad, hasMeal, isEmpty, companyName);
            default:
                throw new IllegalArgumentException("Invalid company name: " + companyName);
        }
    }
}
