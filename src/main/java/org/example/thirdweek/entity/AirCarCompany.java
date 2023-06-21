package org.example.thirdweek.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;
import org.example.thirdweek.enums.CompanyName;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Table
public abstract class AirCarCompany {
    @Column
    private CompanyName companyName;
    @Column
    private Double ticketPrice;
/*    @OneToMany(orphanRemoval = true, fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "Ticket") //instance when calling
    @JsonManagedReference*/
    @Column
    private List<Ticket> tickets;



}
