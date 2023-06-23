package org.example.thirdweek.entity;

import lombok.*;
import org.example.thirdweek.enums.CompanyName;

import javax.persistence.*;

@Entity
@Table(name = "PEGASUS")
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Builder
public class Pegasus {
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
