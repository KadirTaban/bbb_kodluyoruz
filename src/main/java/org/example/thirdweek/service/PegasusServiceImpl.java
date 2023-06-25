package org.example.thirdweek.service;

import lombok.RequiredArgsConstructor;
import org.example.secondWeek.entity.PEGASUS;
import org.example.thirdweek.entity.Pegasus;
import org.example.thirdweek.entity.THY;
import org.example.thirdweek.entity.Ticket;
import org.example.thirdweek.model.dto.PegasusDto;
import org.example.thirdweek.model.dtoConverter.PegasusDtoConverter;
import org.example.thirdweek.repository.PegasusRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PegasusServiceImpl {

    private final PegasusDtoConverter pegasusDtoConverter;
    private final PegasusRepository pegasusRepository;
    public PegasusDto save(Ticket thy){
        Pegasus pegasus = Pegasus.builder()
                .id(thy.getId())
                .hasMeal(thy.getHasMeal())
                .price(thy.getPrice())
                .isEmpty(thy.getIsEmpty())
                .companyName(thy.getCompanyName())
                .seatName(thy.getSeatName())
                .build();

        return pegasusDtoConverter.convertToDto(pegasusRepository.save(pegasus));
    }

    public List<Pegasus> findAvailable() {
        List<Pegasus> availableTHYs = pegasusRepository.FindIsEmpty();

        return availableTHYs;
    }

    public Pegasus buyTicket(long id){
        Pegasus ticket = pegasusRepository.FindEmptyId(id);
        ticket.setIsEmpty(false);
        pegasusRepository.save(ticket);
        return ticket;
    }
}
