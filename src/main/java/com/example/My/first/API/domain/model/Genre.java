package com.example.My.first.API.domain.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "genre")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID actorid;


    public String text;
}
