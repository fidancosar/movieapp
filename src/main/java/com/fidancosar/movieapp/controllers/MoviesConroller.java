package com.fidancosar.movieapp.controllers;

import com.fidancosar.movieapp.entities.Movies;
import com.fidancosar.movieapp.model.requests.MoviesRequest;
import com.fidancosar.movieapp.services.MoviesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Movies")
public class MoviesConroller {
    private final MoviesService moviesService;

    public MoviesConroller(MoviesService moviesService) {
        this.moviesService = moviesService;
    }

    @PostMapping
    public ResponseEntity add(MoviesRequest moviesRequest) {
        moviesService.add(moviesRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body("Film Eklendi");

    }
    @GetMapping("/{id}")
    public Movies getById(@PathVariable int id) {
        return moviesService.getById(id);
    }

    @GetMapping("getAll")
    public ResponseEntity<List<MoviesRequest>> getMovies() {
        List<Movies> getAll = moviesService.getAll();
        return new ResponseEntity<List<MoviesRequest>>( HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") int deleteId) {
        moviesService.deleteByMovieId(deleteId);

        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }
}