package com.cine.database.repositories;

import com.cine.database.entities.MovieEntity;
import com.cine.database.jparepositories.MovieJpaRepository;
import com.cine.domain.movie.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class DefaultMovieRepository {

    @Autowired
    MovieJpaRepository movieJpaRepository;

    public List<Movie> getAll(){
        return movieJpaRepository.findAll().stream().map(this::toMovie).collect(Collectors.toList());
    }

    public Optional<Movie> findMovieById(int id){
        return movieJpaRepository.findById(id).map(this::toMovie);
    }

    private Movie toMovie(MovieEntity entity){
        Movie movie= new Movie();
        movie.setId(entity.getId());
        movie.setPoster(entity.getPoster());
        movie.setTitle(entity.getTitle());
        movie.setSynopsis(entity.getSypnosis());
        movie.setTrailer(entity.getTrailer());
        return  movie;
    }
}
