package com.fidancosar.movieapp.repositories;

import com.fidancosar.movieapp.entities.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepository extends JpaRepository<Movies, Integer>  {
}
