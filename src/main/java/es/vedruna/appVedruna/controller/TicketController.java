package es.vedruna.appVedruna.controller;

import es.vedruna.appVedruna.model.Ticket;
import es.vedruna.appVedruna.services.TicketServiceImpl;
import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/proyecto01/tickets")
@AllArgsConstructor
public class TicketController {

    private final TicketServiceImpl ticketServiceImpl;

    @PostMapping()
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketServiceImpl.createTicket(ticket);
    }
    @GetMapping()
    public List<Ticket> getAllTickets() {
        return ticketServiceImpl.getAllTickets();
    }
    
}
