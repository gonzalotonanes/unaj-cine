package com.cine.domain.ticket;

import com.cine.domain.function.Function;
import lombok.Data;

@Data
public class Ticket {

    private String id;
    private String user;
    private int idFunction;
}
