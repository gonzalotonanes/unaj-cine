package com.cine.database.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "movie")
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title", length = 50)
    private String title;

    @Column(name = "poster", length = 255)
    private String poster;

    @Column(name = "synopsis", length = 255)
    private String sypnosis;

    @Column(name = "trailer" , length = 255)
    private String trailer;

}