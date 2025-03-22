package com.example.models;

public class Schedule {
    public Movie movie;
    // public Date date;
    public Room room;

    public Schedule(Movie movie, Room room) {
        this.movie = movie;
        // this.date = date;
        this.room = room;
    }

    public Schedule getSheduule() {
        return this;
    }

    public Movie getMovie() {
        return movie;
    }

    public Room getRoom() {
        return room;
    }

    public String getMovieTitle() {
        return movie.getTitle();
    }

    public String getMovieGenre() {
        return movie.getGenre();
    }

    public int getMovieDuration() {
        return movie.getDuration();
    }

    public String getRoomName() {
        return room.getName();
    }

    public int getRoomCapacity() {
        return room.getCapacity();
    }

    @Override

    public String toString() {
        return "Shedule{" +
                "movie=" + movie +
                ", room=" + room +
                '}';
    }
}
