package com.cine.domain.ticket;

import com.cine.database.repositories.DefaultTicketRepository;
import org.springframework.stereotype.Service;

@Service
public class DefaultTicketService implements TicketService{

    private DefaultTicketRepository defaultTicketRepository;

    public DefaultTicketService(DefaultTicketRepository defaultTicketRepository) {
        this.defaultTicketRepository = defaultTicketRepository;
    }

    @Override
    public Ticket save(Ticket ticket) {
        return defaultTicketRepository.save(ticket);
    }
    @Override
    public int countTicketByFunction(int id) {
        return defaultTicketRepository.countTicketByFunction(id);
    }
}
