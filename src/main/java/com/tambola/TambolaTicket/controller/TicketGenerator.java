package com.tambola.TambolaTicket.controller;

import com.tambola.TambolaTicket.ticket_generator.Solution;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class TicketGenerator {

    private Solution solution = new Solution();

    @GetMapping("/tickets")
    HashMap<String, List<List<Integer>>> generateSets() {
        return solution.generateTambolaSets();
    }
}
