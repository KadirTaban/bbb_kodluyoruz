package org.example.thirdweek.entity;

import lombok.*;
import org.example.thirdweek.enums.CompanyName;

import javax.persistence.*;

@Entity
@Table(name = "ONURAIR")
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Getter
@Setter
public class OnurAir {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
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
