package com.example.models;

import java.util.List;

public class Cinema {
    private String adress;
    private List<String> rooms;
    private Billboard billboard;
    private Department department;

    public Cinema(String adress, List<String> rooms, Billboard billboard, Department department) {
        this.adress = adress;
        this.rooms = rooms;
        this.billboard = billboard;
        this.department = department;
    }

    public void addRoom(String room) {
        rooms.add(room);
    }

    public void removeRoom(String room) {
        rooms.remove(room);
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List<String> getRooms() {
        return rooms;
    }

    public void setRooms(List<String> rooms) {
        this.rooms = rooms;
    }

    public Billboard getBillboard() {
        return billboard;
    }

    public void setBillboard(Billboard billboard) {
        this.billboard = billboard;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}
