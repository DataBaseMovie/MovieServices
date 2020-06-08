package com.next.services.movies.model.genres;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Arrays;

/*
 * Classe Name   : GenresArraysList
 * Date creation : 24/05/2020
 *
 * Copyright     : kmvelia
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenresMovie {

    private GenresListResult[] genres;

    public GenresListResult[] getGenres() {
        return genres;
    }

    @Override
    public String toString() {
        return "GenresArraysList{" +
                "genresMovies=" + Arrays.toString(genres) +
                '}';
    }
}
