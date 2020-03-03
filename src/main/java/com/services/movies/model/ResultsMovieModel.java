package com.services.movies.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.lang.Nullable;

import java.util.ArrayList;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultsMovieModel {

    @Nullable
    private String              poster_path;
    private boolean             adult;
    private String              overview;
    private String              release_date;
    private ArrayList<Integer> genre_ids;
    private int                 id;
    private String              original_title;
    private String              original_language;
    private String              title;
    @Nullable
    private String              backdrop_path;
    private Number              popularity;
    private int                 vote_count;
    private boolean             video;
    private int                 vote_average;

    /**
     * Gets poster path.
     *
     * @return the poster path
     */
    @Nullable
    public String getPoster_path() {
        return poster_path;
    }

    /**
     * Sets poster path.
     *
     * @param poster_path the poster path
     */
    public void setPoster_path(@Nullable String poster_path) {
        this.poster_path = poster_path;
    }

    /**
     * Is adult boolean.
     *
     * @return the boolean
     */
    public boolean isAdult() {
        return adult;
    }

    /**
     * Sets adult.
     *
     * @param adult the adult
     */
    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    /**
     * Gets overview.
     *
     * @return the overview
     */
    public String getOverview() {
        return overview;
    }

    /**
     * Sets overview.
     *
     * @param overview the overview
     */
    public void setOverview(String overview) {
        this.overview = overview;
    }

    /**
     * Gets release date.
     *
     * @return the release date
     */
    public String getRelease_date() {
        return release_date;
    }

    /**
     * Sets release date.
     *
     * @param release_date the release date
     */
    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    /**
     * Gets genre ids.
     *
     * @return the genre ids
     */
    public ArrayList<Integer> getGenre_ids() {
        return genre_ids;
    }

    /**
     * Sets genre ids.
     *
     * @param genre_ids the genre ids
     */
    public void setGenre_ids(ArrayList<Integer> genre_ids) {
        this.genre_ids = genre_ids;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets original title.
     *
     * @return the original title
     */
    public String getOriginal_title() {
        return original_title;
    }

    /**
     * Sets original title.
     *
     * @param original_title the original title
     */
    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    /**
     * Gets original language.
     *
     * @return the original language
     */
    public String getOriginal_language() {
        return original_language;
    }

    /**
     * Sets original language.
     *
     * @param original_language the original language
     */
    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets backdrop path.
     *
     * @return the backdrop path
     */
    @Nullable
    public String getBackdrop_path() {
        return backdrop_path;
    }

    /**
     * Sets backdrop path.
     *
     * @param backdrop_path the backdrop path
     */
    public void setBackdrop_path(@Nullable String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    /**
     * Gets popularity.
     *
     * @return the popularity
     */
    public Number getPopularity() {
        return popularity;
    }

    /**
     * Sets popularity.
     *
     * @param popularity the popularity
     */
    public void setPopularity(Number popularity) {
        this.popularity = popularity;
    }

    /**
     * Gets vote count.
     *
     * @return the vote count
     */
    public int getVote_count() {
        return vote_count;
    }

    /**
     * Sets vote count.
     *
     * @param vote_count the vote count
     */
    public void setVote_count(int vote_count) {
        this.vote_count = vote_count;
    }

    /**
     * Is video boolean.
     *
     * @return the boolean
     */
    public boolean isVideo() {
        return video;
    }

    /**
     * Sets video.
     *
     * @param video the video
     */
    public void setVideo(boolean video) {
        this.video = video;
    }

    /**
     * Gets vote average.
     *
     * @return the vote average
     */
    public int getVote_average() {
        return vote_average;
    }

    /**
     * Sets vote average.
     *
     * @param vote_average the vote average
     */
    public void setVote_average(int vote_average) {
        this.vote_average = vote_average;
    }

    @Override
    public String toString() {
        return "ResultsDiscoverMovieDTO{" +
                "poster_path='" + poster_path + '\'' +
                ", adult=" + adult +
                ", overview='" + overview + '\'' +
                ", release_date='" + release_date + '\'' +
                ", genre_ids=" + genre_ids +
                ", id=" + id +
                ", original_title='" + original_title + '\'' +
                ", original_language='" + original_language + '\'' +
                ", title='" + title + '\'' +
                ", backdrop_path='" + backdrop_path + '\'' +
                ", popularity=" + popularity +
                ", vote_count=" + vote_count +
                ", video=" + video +
                ", vote_average=" + vote_average +
                '}';
    }

}
