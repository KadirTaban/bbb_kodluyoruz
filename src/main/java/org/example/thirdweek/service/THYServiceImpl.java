package org.example.thirdweek.service;

import lombok.RequiredArgsConstructor;
import org.example.thirdweek.entity.THY;
import org.example.thirdweek.repository.THYRepository;
import org.example.thirdweek.repository.TicketRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class THYServiceImpl {
    private final THYRepository repository;
    private final TicketRepository ticketRepository;

    public THY save(THY thy){

        return repository.save(thy) ;
    }

        public List<THY> thyList(){
        List<THY> thyList = repository.findAllByEmptyIsTrue();
        return thyList;

    }
}
