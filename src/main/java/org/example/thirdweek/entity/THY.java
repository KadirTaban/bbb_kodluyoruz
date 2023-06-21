package org.example.thirdweek.entity;

import lombok.Getter;
import org.example.thirdweek.enums.CompanyName;

import javax.persistence.*;

@Entity
@Table(name = "THY")
@Getter
public class THY extends Ticket{

    public THY(long id, String seatName, boolean isAbroad, boolean hasMeal, boolean isEmpty, CompanyName companyName) {
        super(id, seatName, isAbroad, hasMeal, isEmpty, companyName);
    }

    public THY() {
        super("A1", true, true, true, CompanyName.THY);
    }

    public THY(String seatName, boolean isAbroad, boolean hasMeal, boolean isEmpty, CompanyName companyName) {
        super(seatName, isAbroad, hasMeal, isEmpty, companyName);
    }
}
