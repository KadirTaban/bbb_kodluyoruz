package org.example.thirdweek.service;

import lombok.RequiredArgsConstructor;
import org.example.thirdweek.entity.THY;
import org.example.thirdweek.entity.Ticket;
import org.example.thirdweek.model.dto.THYDto;
import org.example.thirdweek.model.dtoConverter.THYDtoConverter;
import org.example.thirdweek.repository.THYRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class THYServiceImpl {
    private final THYRepository repository;
    private final THYDtoConverter thyDtoConverter;
    public THYDto save(Ticket thy){
        THY thy1 = THY.builder()
                .hasMeal(thy.getHasMeal())
                .price(thy.getPrice())
                .isEmpty(thy.getIsEmpty())
                .isAbroad(thy.getIsAbroad())
                .companyName(thy.getCompanyName())
                .seatName(thy.getSeatName())
                .build();

        return thyDtoConverter.convertToTHY(repository.save(thy1));
    }

    public List<THY> findAvailable() {
        List<THY> availableTHYs = repository.findTHYByIsEmptyIs();

        return availableTHYs;
    }
    public THY buyTicket(long id){
        THY ticket = repository.findTHYById(id);
        ticket.setIsEmpty(false);
        repository.save(ticket);
        return ticket;
    }



    }
