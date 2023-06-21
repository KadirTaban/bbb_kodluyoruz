package org.example.thirdweek.entity;

import lombok.*;
import org.example.thirdweek.enums.CompanyName;

import javax.persistence.*;

@Entity
@Table(name = "Ticket")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String seatName;
    @Column
    private boolean isAbroad;
    @Column
    private boolean hasMeal;
    @Column
    private boolean isEmpty;
    @Column
    private CompanyName companyName;

    public Ticket(String seatName, boolean isAbroad, boolean hasMeal, boolean isEmpty, CompanyName companyName){
        this.seatName = seatName;
        this.isEmpty = isEmpty;
        this.isAbroad = isAbroad;
        this.hasMeal = hasMeal;
        this.companyName = companyName;

    }
}
