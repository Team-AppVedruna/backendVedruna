package es.vedruna.appVedruna.controller;

import es.vedruna.appVedruna.model.Ticket;
import es.vedruna.appVedruna.services.TicketServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/proyecto01/tickets")
@AllArgsConstructor
public class TicketController {

    private final TicketServiceImpl ticketServiceImpl;

    @PostMapping()
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketServiceImpl.createTicket(ticket);
    }
}
