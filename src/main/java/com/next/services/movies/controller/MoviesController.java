package com.next.services.movies.controller;

import com.google.gson.Gson;
import com.next.services.movies.model.genres.GenresMovie;
import com.next.services.movies.model.movies.MoviesModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe Name   : MovieController
 * Date création : 2019-08-11
 *
 * Copyright     : kmvelia
 */
@Controller
@Configuration
@PropertySource("classpath:application.properties")
@RequestMapping(value = "/data", method = RequestMethod.GET, headers = "Accept=application/json")
public class MoviesController {

    @Value("${my.resource.api.base-url-discover}")
    private String BASE_URL_DISCOVER;
    @Value("${my.resource.api.base-url-genres}")
    private String BASE_URL_GENRES;
    @Value("${my.resource.api-key}")
    private String API_KEY;

    /**
     * Rest template instance.
     *
     * @return the rest template
     */
    @Autowired
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @ResponseBody
    @CrossOrigin
    @RequestMapping(value = "/movies", method = RequestMethod.GET, headers="Accept=application/json")
    public String GetAllMoviesData(@RequestParam(defaultValue = "1") String page) {

        MoviesModel discoverMovieModel;
        GenresMovie listGenreMovie;

        discoverMovieModel = restTemplate().getForObject(BASE_URL_DISCOVER + "?api_key=" + API_KEY
                + "&language=fr-FR&sort_by=popularity.desc&include_adult=false&include_video=false&primary_release_date.gte=2018&page="
                + page, MoviesModel.class);
        listGenreMovie = restTemplate().getForObject(BASE_URL_GENRES + "?api_key=" + API_KEY
                + "&language=fr-FR", GenresMovie.class );
        List<Object> ArrayOfMovies = new ArrayList<>();

        ArrayOfMovies.add(discoverMovieModel);
        ArrayOfMovies.add(listGenreMovie);

        return new Gson().toJson(ArrayOfMovies);
    }

}
