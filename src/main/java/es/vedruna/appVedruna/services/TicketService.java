package es.vedruna.appVedruna.services;

import java.util.List;

import es.vedruna.appVedruna.model.Ticket;

public interface TicketService {
    public Ticket createTicket(Ticket ticket);
    List<Ticket> getAllTickets();
}
