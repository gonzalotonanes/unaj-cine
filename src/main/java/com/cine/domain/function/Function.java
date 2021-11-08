package com.cine.domain.function;

import lombok.Data;

import java.util.Date;
@Data
public class Function {

    private int id;
    private int idMovie;
    private int idTheater;
    private Date date;
    private Date hour;

}
