package org.example.thirdweek.entity;

import org.example.thirdweek.enums.CompanyName;

import javax.persistence.*;

@Entity
@Table(name = "ONURAIR")
public class OnurAir extends Ticket{
    public OnurAir(long id, String seatName, boolean isAbroad, boolean hasMeal, boolean isEmpty, CompanyName companyName) {
        super(id, seatName, isAbroad, hasMeal, isEmpty, companyName);
    }


    public OnurAir(String seatName, boolean isAbroad, boolean hasMeal, boolean isEmpty, CompanyName companyName) {
        super(seatName, isAbroad, hasMeal, isEmpty, companyName);
    }

    public OnurAir() {

    }
}
