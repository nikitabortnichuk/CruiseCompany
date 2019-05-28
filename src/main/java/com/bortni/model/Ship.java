package com.bortni.model;

import java.util.List;

public class Ship {
    private int id;
    private int name;
    private int passenger_capacity;
    private Personal personal;
    private List<Cruise> cruises;

    public Ship(int id, int name, int passenger_capacity, Personal personal, List<Cruise> cruises) {
        this.id = id;
        this.name = name;
        this.passenger_capacity = passenger_capacity;
        this.personal = personal;
        this.cruises = cruises;
    }

    public Ship() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getPassenger_capacity() {
        return passenger_capacity;
    }

    public void setPassenger_capacity(int passenger_capacity) {
        this.passenger_capacity = passenger_capacity;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public List<Cruise> getCruises() {
        return cruises;
    }

    public void setCruises(List<Cruise> cruises) {
        this.cruises = cruises;
    }
}
