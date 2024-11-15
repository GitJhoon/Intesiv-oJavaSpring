package com.example.IntensivaoJavaSpring.dto;

import com.example.IntensivaoJavaSpring.entities.Game;

public class GameMinDto {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String shortDescription;

    public GameMinDto() {
    }

    public GameMinDto(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        genre = entity.getGenre();
        shortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
