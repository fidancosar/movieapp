package com.fidancosar.movieapp.services;

import com.fidancosar.movieapp.entities.Movies;
import com.fidancosar.movieapp.model.requests.MoviesRequest;
import com.fidancosar.movieapp.repositories.MoviesRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class MoviesServiceImp  implements MoviesService{
    private MoviesRepository moviesRepository;

    public MoviesServiceImp(MoviesRepository moviesRepository) {
        this.moviesRepository = moviesRepository;
    }

    @Override
    public void add(MoviesRequest movies) {
        Movies movie = new Movies();
        movie.setMovieName(movie.getMovieName());

        moviesRepository.save(movie);

    }

    @Override
    public Movies getById(int id) {
        Optional<Movies> moviesOptional = moviesRepository.findById(id);
        Movies movies = moviesOptional.orElseThrow(()-> new RuntimeException("Id bulunamadı."));
        return moviesRepository.getById(id);
    }

    @Override
    public List<Movies> getAll() {
        return moviesRepository.findAll();
    }

    @Override
    public void deleteByMovieId(long deleteByMovieId) {

    }
}
