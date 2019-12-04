package com.spikes.cinemaz.service;

import com.spikes.cinemaz.model.Movie;
import com.spikes.cinemaz.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository repo;

    List<Movie> getAll() {
        return repo.findAll();
    }

    public Movie addMovie(Movie movie) {
        return repo.save(movie);
    }

    public Movie addMovie(String title) {
        Movie movie = new Movie();
        movie.setTitle(title);
        return repo.save(movie);
    }
}
