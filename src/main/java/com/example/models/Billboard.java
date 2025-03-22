package com.example.models;

import java.util.List;

public class Billboard {
    private List<Schedule> shedules;

    public Billboard(List<Schedule> shedules) {
        this.shedules = shedules;
    }

    public void addShedule(Schedule shedule) {
        shedules.add(shedule);
    }

    public void removeShedule(Schedule shedule) {
        shedules.remove(shedule);
    }

    public List<Schedule> getSheduleList() {
        return shedules;
    }
}
