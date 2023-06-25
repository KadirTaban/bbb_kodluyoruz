package org.example.thirdweek.controller;

import lombok.AllArgsConstructor;
import org.example.secondWeek.entity.PEGASUS;
import org.example.thirdweek.entity.Pegasus;
import org.example.thirdweek.service.PegasusServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/ticketPegasus")
@RestController
@AllArgsConstructor
public class PegasusController {
    private final PegasusServiceImpl service;
    @GetMapping("/availableTickets")
    public List<Pegasus> findAvailablePegasus() {
        return service.findAvailable();
    }

    @PostMapping("/buyTicket/{id}")
    public Pegasus buyTicketPegasus(@PathVariable("id") long id) {
        return service.buyTicket(id);

    }


}

