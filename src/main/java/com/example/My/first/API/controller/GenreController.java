package com.example.My.first.API.controller;

import com.example.My.first.API.domain.model.Genre;
import com.example.My.first.API.repository.GenreRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/genres")
public class GenreController {

    private final GenreRepository genreRepository;

    public GenreController(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @GetMapping("/")
        public List<Genre> listGenres() {
            return genreRepository.findAll();
        }

        @GetMapping("/rating")
        public String ratingGenre() {
            return "8/10 missing more genres";
        }
        @GetMapping("")
        public String missedParameter() {
            return "Missed parameters";
        }

}
