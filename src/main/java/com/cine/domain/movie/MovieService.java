package com.cine.domain.movie;

import java.util.List;

public interface MovieService {

    List<Movie> getAll();
    Movie findMovieById(int id);

}
