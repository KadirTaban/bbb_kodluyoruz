package org.example.thirdweek.controller;


import lombok.AllArgsConstructor;
import org.example.thirdweek.entity.Ticket;
import org.example.thirdweek.model.data.TicketData;
import org.example.thirdweek.service.TicketServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/ticket")
@RestController
@AllArgsConstructor
public class TicketController {
    private final TicketServiceImpl service;
    private final TicketData ticketData;
    @PostMapping("/save")
    public String mockData(){
        service.saveMockTicket(ticketData.getTickets());
        return "Success";
    }


    @GetMapping("/availableTicket")
    public List<Ticket> findAvailableTickets(){

        return service.availableTicketList();
    }

    @PostMapping("/buy/{id}")
    public String buyTicket(@PathVariable("id") long id){
        service.buyTicket(id);
        return "Success";
    }

}
