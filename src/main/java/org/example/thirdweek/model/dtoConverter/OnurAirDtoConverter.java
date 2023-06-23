package org.example.thirdweek.model.dtoConverter;

import lombok.RequiredArgsConstructor;
import org.example.thirdweek.entity.OnurAir;
import org.example.thirdweek.entity.Pegasus;
import org.example.thirdweek.model.dto.OnurAirDto;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OnurAirDtoConverter {
    public OnurAirDto convertToDto(OnurAir onurAir){
        return OnurAirDto.builder()
                .seatName(onurAir.getSeatName())
                .price(onurAir.getPrice())
                .companyName(onurAir.getCompanyName())
                .isEmpty(onurAir.getIsEmpty())
                .hasMeal(onurAir.getHasMeal())
                .isAbroad(onurAir.getIsAbroad())
                .build();
    }
}
