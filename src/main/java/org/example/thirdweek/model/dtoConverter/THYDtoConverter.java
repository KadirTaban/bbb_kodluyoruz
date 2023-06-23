package org.example.thirdweek.model.dtoConverter;

import lombok.RequiredArgsConstructor;
import org.example.thirdweek.entity.THY;
import org.example.thirdweek.entity.Ticket;
import org.example.thirdweek.model.dto.THYDto;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class THYDtoConverter {

    public THYDto convertToTHY(THY from){
        return THYDto.builder()
                .companyName(from.getCompanyName())
                .hasMeal(from.getHasMeal())
                .isAbroad(from.getIsAbroad())
                .isEmpty(from.getIsEmpty())
                .seatName(from.getSeatName())
                .price(from.getPrice())
                .build();
    }

}
