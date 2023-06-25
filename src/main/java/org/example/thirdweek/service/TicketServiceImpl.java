package org.example.thirdweek.service;

import lombok.RequiredArgsConstructor;
import org.example.thirdweek.entity.Pegasus;
import org.example.thirdweek.entity.THY;
import org.example.thirdweek.entity.Ticket;
import org.example.thirdweek.model.data.TicketData;
import org.example.thirdweek.model.dtoConverter.PegasusTicketDtoConverter;
import org.example.thirdweek.model.dtoConverter.THYDtoConverter;
import org.example.thirdweek.model.dtoConverter.THYTicketDtoConverter;
import org.example.thirdweek.repository.OnurAirRepository;
import org.example.thirdweek.repository.PegasusRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TicketServiceImpl extends TicketFactory {
    private Ticket ticket;
    private TicketData ticketData = new TicketData();
    private final THYServiceImpl thyService;
    private final PegasusServiceImpl pegasusService;
    private final OnurAirServiceImpl onurAirService;
    private final THYDtoConverter thyDtoConverter;
    private final THYTicketDtoConverter thyTicketDtoConverter;
    private final PegasusTicketDtoConverter pegasusTicketDtoConverter;
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
                    onurAirService.save(createdTicket);
                    break;
                case PEGASUS:
                    pegasusService.save( createdTicket);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid company name: " + ticket.getCompanyName());
            }
        });
    }


    public List<Ticket> availableTicketList(){
        List<Ticket> availableTickets = new ArrayList<>();
        thyService.findAvailable().stream().forEach(thy -> availableTickets.add(thyTicketDtoConverter.convertToTicket(thy)));
        pegasusService.findAvailable().stream().forEach(pegasus -> availableTickets.add(pegasusTicketDtoConverter.convertToTicket(pegasus)));
        return availableTickets;
    }
}
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