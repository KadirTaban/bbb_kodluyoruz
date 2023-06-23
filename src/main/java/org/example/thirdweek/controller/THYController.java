package org.example.thirdweek.controller;

import lombok.AllArgsConstructor;
import org.example.thirdweek.entity.THY;
import org.example.thirdweek.service.THYServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ticketTHY")
@RestController
@AllArgsConstructor
public class THYController {
    private final THYServiceImpl service;

    /*@PostMapping("/save")
    public void findAvailable(){
        return service.save();
    }*/

    @GetMapping("/availableTickets")
    public List<THY> findAvailable() {
        return service.findAvailable();
    }


    @PostMapping("/buyTicket/{id}")
    public THY buyTicket(@PathVariable("id") long id) {
        return service.buyTicket(id);

    }

}
