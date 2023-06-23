package org.example.thirdweek.entity;

import lombok.*;
import org.example.thirdweek.enums.CompanyName;

import javax.persistence.*;

@Entity
@Table(name = "Ticket")
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String seatName;
    @Column
    private Boolean isAbroad;
    @Column
    private Boolean hasMeal;
    @Column
    private Boolean isEmpty;
    @Column
    private double price;
    @Column
    private CompanyName companyName;


    public Ticket(long id, String seatName, Boolean isAbroad, Boolean hasMeal, Boolean isEmpty, CompanyName companyName) {
        this.id = id;
        this.seatName = seatName;
        this.isAbroad = isAbroad;
        this.hasMeal = hasMeal;
        this.isEmpty = isEmpty;
        this.companyName = companyName;
    }
}
