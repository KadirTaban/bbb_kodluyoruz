package org.example.thirdweek.controller;


import lombok.AllArgsConstructor;
import org.example.thirdweek.service.TicketServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/ticket")
@RestController
@AllArgsConstructor
public class TicketController {
    private final TicketServiceImpl service;

    @PostMapping("/save")
    public String mockData(){
        service.saveMockTicket();
        return "Success";
    }

}
