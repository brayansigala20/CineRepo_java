package com.example.Controller;

import java.io.File;
import java.util.List;

import com.example.models.Room;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RoomController {
    RoomController() {

    }

    public List<Room> getRooms() {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("src/main/java/com/example/util/Rooms.json");

        if (!file.exists()) {
            System.out.println("Error: El archivo Movie.json no existe.");
            return null;
        }

        try {
            List<Room> rooms = objectMapper.readValue(file, new TypeReference<List<Room>>() {
            });
            if (rooms.isEmpty()) {
                System.out.println("No hay películas en la lista.");
            }
            return rooms;
        } catch (Exception e) {
            System.out.println("Error al leer el archivo JSON: " + e.getMessage());
            return null;
        }
    }
}
