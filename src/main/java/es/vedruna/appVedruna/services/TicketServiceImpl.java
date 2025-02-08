package es.vedruna.appVedruna.services;

import es.vedruna.appVedruna.model.Ticket;
import es.vedruna.appVedruna.model.Usuario;
import es.vedruna.appVedruna.repository.TicketRepository;
import es.vedruna.appVedruna.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;
    private final UsuarioRepository usuarioRepository;

    @Override
    public Ticket createTicket(Ticket ticket) {

        Usuario usuario = usuarioRepository.findById(ticket.getUsuarioId())
                                           .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        ticket.setUsuarioId(usuario.getId());

        return ticketRepository.save(ticket);
    }
}
