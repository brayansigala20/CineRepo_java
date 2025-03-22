package com.example.Controller;

import java.util.ArrayList;
import java.util.List;

import com.example.models.Billboard;
import com.example.models.Schedule;

public class BillboardController {
    public BillboardController() {
    }

    public List<Schedule> getBillboard() {
        MovieController movieController = new MovieController();

        RoomController roomController = new RoomController();

        List<Schedule> sessions = new ArrayList<>();
        for (int i = 0; i < Math.min(movieController.getMovies().size(), roomController.getRooms().size()); i++) {
            sessions.add(new Schedule(movieController.getMovies().get(i), roomController.getRooms().get(i)));
        }

        return sessions;

    }
}
