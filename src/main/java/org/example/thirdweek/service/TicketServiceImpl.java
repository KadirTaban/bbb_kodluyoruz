package org.example.thirdweek.service;

import lombok.RequiredArgsConstructor;
import org.example.thirdweek.entity.Pegasus;
import org.example.thirdweek.entity.Ticket;
import org.example.thirdweek.model.data.TicketData;
import org.example.thirdweek.repository.OnurAirRepository;
import org.example.thirdweek.repository.PegasusRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TicketServiceImpl extends TicketFactory {
    private Ticket ticket;
    private TicketData ticketData = new TicketData();
    private final THYServiceImpl thyService;
    private final PegasusServiceImpl pegasusService;
    private final OnurAirServiceImpl onurAirService;

    public void saveMockTicket() {
        List<Ticket> tickets = ticketData.getTickets();

        tickets.forEach(ticket -> {
            Ticket createdTicket = TicketFactory.createTicket(ticket.getId(),ticket.getCompanyName(), ticket.getSeatName(),
                    ticket.getIsAbroad(), ticket.getHasMeal(), ticket.getIsEmpty());
            // Save the createdTicket using the respective repository
            switch (ticket.getCompanyName()) {
                case THY:
                    thyService.save(createdTicket);
                    break;
                case ONUR_AIR:
                    pegasusService.save(createdTicket);
                    break;
                case PEGASUS:
                    onurAirService.save( createdTicket);
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
