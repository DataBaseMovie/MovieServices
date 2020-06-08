package com.next.services.movies.controller;

import com.next.services.movies.model.genres.GenresMovie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


/*
 * Classe Name   : GenresController
 * Date creation : 24/05/2020
 *
 * Copyright     : kmvelia
 */
@Controller
@Configuration
@PropertySource("classpath:application.properties")
@RequestMapping(value = "/data", method = RequestMethod.GET, headers = "Accept=application/json")
public class GenresController {

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
    @RequestMapping(value = "/genres/list", method = RequestMethod.GET, headers="Accept=application/json")
    public GenresMovie GetGenresListData() {

        GenresMovie genresMovie;

        genresMovie = restTemplate().getForObject(BASE_URL_GENRES + "?api_key=" + API_KEY
                + "&language=fr-FR", GenresMovie.class );

        return genresMovie;
    }

}
