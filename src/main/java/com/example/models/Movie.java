package com.example.models;

import java.util.List;

public class Movie {
    private String title;
    private int duration;
    private String genre;
    private String director;
    private List<String> actors;

    public Movie() {
    }

    public Movie(String title, int duration, String genre, String director, List<String> actors) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.director = director;
        this.actors = actors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    @Override

    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", genre='" + genre + '\'' +
                ", director='" + director + '\'' +
                ", actors=" + actors +
                '}';
    }
}
