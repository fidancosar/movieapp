package com.fidancosar.movieapp.services;

import com.fidancosar.movieapp.entities.Movies;
import com.fidancosar.movieapp.model.requests.MoviesRequest;

public interface MoviesService {

    void add(MoviesRequest movies);

    Movies getById(int id);
}
