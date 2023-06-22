package org.example.thirdweek.controller;

import lombok.AllArgsConstructor;
import org.example.thirdweek.entity.THY;
import org.example.thirdweek.service.THYServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/ticketTHY")
@RestController
@AllArgsConstructor
public class THYController {
    private final THYServiceImpl service;

    @PostMapping("/save")
    public void findAvailable(){
    }

}
