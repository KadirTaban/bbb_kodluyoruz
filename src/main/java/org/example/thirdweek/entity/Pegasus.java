package org.example.thirdweek.entity;

import org.example.thirdweek.enums.CompanyName;

import javax.persistence.*;

@Entity
@Table(name = "PEGASUS")
public class Pegasus extends Ticket{
    public Pegasus(long id, String seatName, boolean isAbroad, boolean hasMeal, boolean isEmpty, CompanyName companyName) {
        super(id, seatName, isAbroad, hasMeal, isEmpty, companyName);
    }

    public Pegasus() {
        super("A1", true, true, true, CompanyName.THY);
    }

    public Pegasus(String seatName, boolean isAbroad, boolean hasMeal, boolean isEmpty, CompanyName companyName) {
        super(seatName, isAbroad, hasMeal, isEmpty, companyName);
    }
}
