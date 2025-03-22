package com.example.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Room {
    private int id;
    private String name;
    private int capacity;
    private List<Seat> seats;

    public Room() {
    }

    public Room(int id, String name, int capacity, List<Seat> seats, String date) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.seats = seats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getSeats() {
        return getSeats();
    }

    public boolean availability() {
        return true;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", seats='" + seats + '\'' +
                '}';

    }
}
