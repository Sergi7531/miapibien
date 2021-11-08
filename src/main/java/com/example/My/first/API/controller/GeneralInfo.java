package com.example.My.first.API.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/info")
public class GeneralInfo {

        @GetMapping("/description")
        public String world() {
            return "This is the endpoint description";
        }

        @GetMapping("/rating")
        public String mars() {
            return "8/10 missing more endpoints";
        }
        @GetMapping("/")
        public String jupiter() {
            return "Hello endpoint";
        }
    }
