package com.example.models;

public class Department {
    private int id;
    private String name;

    public Department() {
    }

    public Department(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
