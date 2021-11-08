package com.cine.database.entities;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "movie_function")
public class FunctionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name= "date")
    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(name= "hour")
    @Temporal(TemporalType.TIME)
    private Date hour;

    @JoinColumn(name = "idMovie", referencedColumnName = "id")
    private int idMovie;

    @JoinColumn(name = "idTheater", referencedColumnName = "id")
    private int idTheater;
}