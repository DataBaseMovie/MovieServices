package com.services.movies.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MoviesModel {

    private int                         page;
    private ResultsMovieModel[]         results;
    private int                         total_results;
    private int                         total_pages;

    /**
     * Gets page.
     *
     * @return the page
     */
    public int getPage() {
        return page;
    }

    /**
     * Sets page.
     *
     * @param page the page
     */
    public void setPage(int page) {
        this.page = page;
    }

    /**
     * Get results results discover movie [ ].
     *
     * @return the results discover movie [ ]
     */
    public ResultsMovieModel[] getResults() {
        return results;
    }

    /**
     * Sets results.
     *
     * @param results the results
     */
    public void setResults(ResultsMovieModel[] results) {
        this.results = results;
    }

    /**
     * Gets total results.
     *
     * @return the total results
     */
    public int getTotal_results() {
        return total_results;
    }

    /**
     * Sets total results.
     *
     * @param total_results the total results
     */
    public void setTotal_results(int total_results) {
        this.total_results = total_results;
    }

    /**
     * Gets total pages.
     *
     * @return the total pages
     */
    public int getTotal_pages() {
        return total_pages;
    }

    /**
     * Sets total pages.
     *
     * @param total_pages the total pages
     */
    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    @Override
    public String toString() {
        return "DiscoverMovieDTO{" +
                "page=" + page +
                ", results=" + Arrays.toString(results) +
                ", total_results=" + total_results +
                ", total_pages=" + total_pages +
                '}';
    }
}
