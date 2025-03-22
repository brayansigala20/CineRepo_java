package com.example.Controller;

import java.io.File;
import java.util.List;

import com.example.models.Seat;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SeatsController {

    public SeatsController() {
    }

    public List<Seat> getSeats() {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("src/main/java/com/example/util/Seats.json");
        if (!file.exists()) {
            System.out.println("Error: El archivo Seats.json no existe.");
            return null;
        }

        try {
            List<Seat> seats = objectMapper.readValue(file, new TypeReference<List<Seat>>() {
            });
            if (seats.isEmpty()) {
                System.out.println("No hay asientos en la lista.");
            }
            return seats;
        } catch (Exception e) {
            System.out.println("Error al leer el archivo JSON: " + e.getMessage());
            return null;
        }
    }
}
