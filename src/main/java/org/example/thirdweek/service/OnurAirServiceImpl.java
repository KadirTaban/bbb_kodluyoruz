package org.example.thirdweek.service;

import lombok.RequiredArgsConstructor;
import org.example.thirdweek.entity.OnurAir;
import org.example.thirdweek.entity.Pegasus;
import org.example.thirdweek.entity.THY;
import org.example.thirdweek.entity.Ticket;
import org.example.thirdweek.model.dto.OnurAirDto;
import org.example.thirdweek.model.dto.PegasusDto;
import org.example.thirdweek.model.dtoConverter.OnurAirDtoConverter;
import org.example.thirdweek.repository.OnurAirRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OnurAirServiceImpl {
    private final OnurAirDtoConverter onurAirDtoConverter;
    private final OnurAirRepository onurAirRepository;
    public OnurAirDto save(Ticket thy){
        OnurAir onurAir = OnurAir.builder()
                .id(thy.getId())
                .hasMeal(thy.getHasMeal())
                .price(thy.getPrice())
                .isEmpty(thy.getIsEmpty())
                .companyName(thy.getCompanyName())
                .seatName(thy.getSeatName())
                .build();

        return onurAirDtoConverter.convertToDto(onurAirRepository.save(onurAir));
    }
    public List<OnurAir> findAvailable() {
        List<OnurAir> availableTHYs = onurAirRepository.FindIsEmpty();

        return availableTHYs;
    }
    public OnurAir buyTicket(long id){
        OnurAir ticket = onurAirRepository.findOnurAirById(id);
        ticket.setIsEmpty(false);
        onurAirRepository.save(ticket);
        return ticket;
    }
}

