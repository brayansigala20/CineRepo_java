package com.example.models;

import java.util.List;

public class Client {
    private int id;
    private String name;
    private List<Ticket> tickets;

    public Client(int id, String name, List<Ticket> tickets) {
        this.id = id;
        this.name = name;
        this.tickets = tickets;
    }

    public boolean hasTicket(Ticket ticket) {
        return tickets.contains(ticket);
    }

    public void purchaseTicket(Ticket ticket) {
        tickets.add(ticket);
    }
}
