package com.company;

import java.util.ArrayList;

public class Character {
    private String name;
    private Items items;
    private ArrayList<String> rooms;
    private String location;

    public Character(String name, Items items){
        this.name = name;
        this.items = items;
        this.rooms = new ArrayList<>();

    }

    public void addRoom(String room) {
        this.rooms.add(room);
    }

    public ArrayList<String> getRooms() {
        return rooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
