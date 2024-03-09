package com.fidancosar.movieapp.model.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieResponse {
    private int id;
    private String movieName;
    private String comment;
    private short rating;
    private String releaseDate;
}
