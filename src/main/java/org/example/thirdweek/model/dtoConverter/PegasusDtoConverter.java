package org.example.thirdweek.model.dtoConverter;

import lombok.RequiredArgsConstructor;
import org.example.thirdweek.entity.Pegasus;
import org.example.thirdweek.model.dto.PegasusDto;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PegasusDtoConverter {
    public PegasusDto convertToDto(Pegasus pegasus){
        return PegasusDto.builder()
                .id(pegasus.getId())
                .seatName(pegasus.getSeatName())
                .price(pegasus.getPrice())
                .companyName(pegasus.getCompanyName())
                .isEmpty(pegasus.getIsEmpty())
                .hasMeal(pegasus.getHasMeal())
                .isAbroad(pegasus.getIsAbroad())
                .build();
    }

}
