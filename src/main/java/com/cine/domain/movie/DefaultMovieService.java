package com.cine.domain.movie;

import com.cine.database.repositories.DefaultMovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DefaultMovieService implements  MovieService{

    private DefaultMovieRepository defaultMovieRepository;


    public DefaultMovieService(DefaultMovieRepository defaultMovieRepository) {
        this.defaultMovieRepository = defaultMovieRepository;
    }

    @Override
    public List<Movie> getAll() {
        return defaultMovieRepository.getAll();
    }

    @Override
    public Movie findMovieById(int id) {
        return defaultMovieRepository.findMovieById(id).get();
    }
}
