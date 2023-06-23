package org.example.thirdweek.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.thirdweek.enums.CompanyName;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OnurAirDto {
    private String seatName;
    private Boolean isAbroad;
    private Boolean hasMeal;
    private Boolean isEmpty;
    private double price;
    private CompanyName companyName;
}
