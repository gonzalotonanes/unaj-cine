package com.cine.domain.ticket;

public interface TicketService {

    Ticket save(Ticket ticket);
    int countTicketByFunction(int id);
}
