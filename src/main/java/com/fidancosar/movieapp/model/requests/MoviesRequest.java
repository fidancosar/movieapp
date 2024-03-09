package com.fidancosar.movieapp.model.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MoviesRequest {
    private int id;
    private String movieName;
    private String comment;
    private short rating;
    private String releaseDate;

}
