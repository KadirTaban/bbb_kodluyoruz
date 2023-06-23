package org.example.thirdweek.model.dto;

import org.example.thirdweek.enums.CompanyName;

public class TicketDto {
    private long id;
    private String seatName;
    private Boolean isAbroad;
    private Boolean hasMeal;
    private Boolean isEmpty;
    private double price;
    private CompanyName companyName;
}
