package es.vedruna.appVedruna.services;

import es.vedruna.appVedruna.model.Publicacion;
import es.vedruna.appVedruna.model.Ticket;
import es.vedruna.appVedruna.model.Usuario;
import es.vedruna.appVedruna.repository.TicketRepository;
import es.vedruna.appVedruna.repository.UsuarioRepository;
import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;

    @Override
    public Ticket createTicket(Ticket ticket) {

        return ticketRepository.save(ticket);
    }

    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }
}
