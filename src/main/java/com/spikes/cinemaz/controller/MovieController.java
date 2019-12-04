package com.spikes.cinemaz.controller;

import com.spikes.cinemaz.model.Movie;
import com.spikes.cinemaz.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    MovieService service;

    @RequestMapping("/movies")
    String getMovies() {
        return "Moviiiieee ";
    }

    @RequestMapping("/")
    String shitWorks() {
        Movie movie = service.addMovie(new Movie(300L, "Natale a Capodanno!!"));
        return "Shit Works! " + movie.toString();
    }
}
