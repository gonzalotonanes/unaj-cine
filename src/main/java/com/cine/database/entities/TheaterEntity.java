package com.cine.database.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="theater")
public class TheaterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="capacity")
    private int capacity;

}