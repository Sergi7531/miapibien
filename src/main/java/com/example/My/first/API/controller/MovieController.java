package com.example.My.first.API.controller;

import com.example.My.first.API.domain.model.Movie;
import com.example.My.first.API.repository.MovieRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping("/")
    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }

    @GetMapping("/1")
        public List<Movie> getMoviesByName() {
//            return movieRepository.findById("26699fbb-0447-4bcb-b7ec-0b81934dd665");
        return movieRepository.findAll();
        }
    @GetMapping("/jupiter")
    public String jupiter() {
        return "Hello Jupiter";
    }

    @PostMapping("/createMovie")
    public Movie createMovie(@RequestBody Movie movie) {
        movieRepository.save(movie);
        return movie;
    }
}
