package org.example.thirdweek.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.thirdweek.entity.OnurAir;
import org.example.thirdweek.entity.Pegasus;
import org.example.thirdweek.entity.THY;
import org.example.thirdweek.entity.Ticket;
import org.example.thirdweek.enums.CompanyName;
import org.example.thirdweek.model.data.TicketData;
import org.example.thirdweek.repository.OnurAirRepository;
import org.example.thirdweek.repository.PegasusRepository;
import org.example.thirdweek.repository.THYRepository;
import org.example.thirdweek.repository.TicketRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TicketServiceImpl {
    private Ticket ticket;
    private TicketData ticketData = new TicketData();
    private final THYRepository thyRepository;
    private final OnurAirRepository onurAirRepository;
    private final PegasusRepository pegasusRepository;
    public void saveMockTicket() {
        List<Ticket> tickets = ticketData.getTickets();

        tickets.forEach(ticket -> {
            Ticket createdTicket = TicketFactory.createTicket(ticket.getCompanyName(), ticket.getSeatName(),
                    ticket.isAbroad(), ticket.isHasMeal(), ticket.isEmpty());
            // Save the createdTicket using the respective repository
            switch (ticket.getCompanyName()) {
                case THY:
                    thyRepository.save((THY) createdTicket);
                    break;
                case ONUR_AIR:
                    onurAirRepository.save((OnurAir) createdTicket);
                    break;
                case PEGASUS:
                    pegasusRepository.save((Pegasus) createdTicket);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid company name: " + ticket.getCompanyName());
            }
        });



/*
        List<THY> thyTicket = tickets.stream()
                .filter(ticket1-> ticket1.getCompanyName()==CompanyName.THY)
                .map(ticket1 -> new THY(ticket1.getSeatName(),ticket1.isAbroad(),ticket1.isHasMeal(),ticket1.isEmpty(),CompanyName.THY))
                .collect(Collectors.toList());
        thyTicket.stream().forEach(thy -> thyRepository.save(thy));


        List<OnurAir> onurAirTickets = tickets.stream()
                .filter(ticket1 -> ticket1.getCompanyName() == CompanyName.ONUR_AIR)
                .map(ticket1 -> new OnurAir(ticket1.getSeatName(),ticket1.isAbroad(),ticket1.isHasMeal(),ticket1.isEmpty(),CompanyName.ONUR_AIR))
                .collect(Collectors.toList());

        onurAirTickets.stream().forEach(onurAir -> onurAirRepository.save(onurAir) );

        List<Pegasus> pegasusTickets = tickets.stream()
                .filter(ticket1 -> ticket1.getCompanyName()==CompanyName.PEGASUS)
                .map(ticket1 -> new Pegasus(ticket1.getSeatName(),ticket1.isAbroad(),ticket1.isAbroad(),ticket1.isHasMeal(),CompanyName.PEGASUS))
                .collect(Collectors.toList());
        pegasusTickets.stream().forEach(pegasus -> pegasusRepository.save(pegasus));*/
    }



    }
