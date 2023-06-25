package org.example.thirdweek.controller;


import lombok.AllArgsConstructor;
import org.example.thirdweek.entity.Ticket;
import org.example.thirdweek.service.TicketServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/ticket")
@RestController
@AllArgsConstructor
public class TicketController {
    private final TicketServiceImpl service;
    @PostMapping("/save")
    public String mockData(){
        service.saveMockTicket();
        return "Success";
    }


    @GetMapping("/availableTicket")
    public List<Ticket> findAvailableTickets(){

        return service.availableTicketList();
    }

}
