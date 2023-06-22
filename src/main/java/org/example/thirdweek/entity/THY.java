package org.example.thirdweek.entity;

import lombok.Getter;
import org.example.thirdweek.enums.CompanyName;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "THY")
@Getter
public class THY extends Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public THY(long id, String seatName, boolean isAbroad, boolean hasMeal, boolean isEmpty, CompanyName companyName) {
        super(id,seatName, isAbroad, hasMeal, isEmpty, companyName);
        this.id = id;
    }

    public THY() {

    }
}
