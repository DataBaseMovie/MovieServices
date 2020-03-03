package com.services.movies.controller;

import com.services.movies.model.MoviesModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * Date création : 2019-08-11
 *
 * @author kmvelia
 */
@Controller
@Configuration
@PropertySource("classpath:application.properties")
public class MoviesController {

    @Value("${my.resource.api.base-url-image}")
    private String BASE_URL_IMAGE;
    @Value("${my.resource.api.base-url-discover}")
    private String BASE_URL_DISCOVER;
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
    @RequestMapping(value = "/movies/data", method = RequestMethod.GET, headers="Accept=application/json")
    public MoviesModel GetAllMoviesData(@RequestParam(defaultValue = "1") String page) {

        MoviesModel discoverMovieData;


        discoverMovieData = restTemplate().getForObject(BASE_URL_DISCOVER +"?api_key="+ API_KEY
                + "&language=fr-FR&sort_by=popularity.desc&include_adult=false&include_video=false&primary_release_date.gte=2018&page="
                + page, MoviesModel.class);

        return discoverMovieData;
    }

    public String getBASE_URL_IMAGE() {
        return BASE_URL_IMAGE;
    }

    public void setBASE_URL_IMAGE(String BASE_URL_IMAGE) {
        this.BASE_URL_IMAGE = BASE_URL_IMAGE;
    }

    public String getBASE_URL_DISCOVER() {
        return BASE_URL_DISCOVER;
    }

    public void setBASE_URL_DISCOVER(String BASE_URL_DISCOVER) {
        this.BASE_URL_DISCOVER = BASE_URL_DISCOVER;
    }

    public String getAPI_KEY() {
        return API_KEY;
    }

    public void setAPI_KEY(String API_KEY) {
        this.API_KEY = API_KEY;
    }
}
