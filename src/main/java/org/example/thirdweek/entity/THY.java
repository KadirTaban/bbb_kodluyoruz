package org.example.thirdweek.entity;

import lombok.*;
import org.example.thirdweek.enums.CompanyName;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "THY")
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class THY{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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



}
