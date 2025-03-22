package com.example.models;

public class Ticket {
    public Client client;
    public String movie;
    public String room;
    public Seat seat;
    public double price;

    public Ticket(Client client, String movie, String room, Seat seat, double price) {
        this.client = client;
        this.movie = movie;
        this.room = room;
        this.seat = seat;
        this.price = price;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String printTicket() {
        return "Client: " + getClient() + "\n" +
                "Movie: " + getMovie() + "\n" +
                "Room: " + getRoom() + "\n" +
                "Seat: " + getSeat() + "\n" +
                "Price: " + getPrice() + "\n";
    }

    @Override
    public String toString() {
        return printTicket();
    }
}