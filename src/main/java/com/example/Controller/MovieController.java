package com.example.Controller;

import java.io.File;
import java.util.List;
import com.example.models.Movie;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MovieController {

    public MovieController() {
    }

    public List<Movie> getMovies() {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("src/main/java/com/example/util/Movies.json");

        if (!file.exists()) {
            System.out.println("Error: El archivo Movie.json no existe.");
            return null;
        }

        try {
            List<Movie> movies = objectMapper.readValue(file, new TypeReference<List<Movie>>() {
            });

            if (movies.isEmpty()) {
                System.out.println("No hay películas en la lista.");
            }
            return movies;
        } catch (Exception e) {
            System.out.println("Error al leer el archivo JSON: " + e.getMessage());
            return null;
        }

    }
}
