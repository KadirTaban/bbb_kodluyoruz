package org.example.thirdweek.model.dtoConverter;

import lombok.RequiredArgsConstructor;
import org.example.thirdweek.entity.OnurAir;
import org.example.thirdweek.entity.Pegasus;
import org.example.thirdweek.entity.Ticket;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OnurAirTicketDtoConverter {
    public Ticket convertToTicket(OnurAir from){
        return Ticket.builder()
                .id(from.getId())
                .companyName(from.getCompanyName())
                .hasMeal(from.getHasMeal())
                .isAbroad(from.getIsAbroad())
                .isEmpty(from.getIsEmpty())
                .seatName(from.getSeatName())
                .price(from.getPrice())
                .build();
    }
}
