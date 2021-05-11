package com.company;

import java.util.HashMap;

public class RoomData {
    java.lang.Character user;
    private String roomName;
    private String longDescription;
    private String shortDescription;
    private String[] items = new String[1];
    private HashMap<String, String> direction = new HashMap<>();



    public RoomData(){

    }

    public void menu() {
        System.out.println(
                "Enter a direction or choose an option: " +
                        "\nn = move north" +
                        "\ne = move east" +
                        "\ns = move south" +
                        "\nw = move west" +
                        "\nget = Search room for items" +
                        "\ni = View items" +
                        "\nname = Room name" +
                        "\nmore = Room description" +
                        "\nexit = quit game"
        );

    }

    public String[] getItems() {
        return items;
    }

    public void addItems(String item){
        this.items[0] = item;
    }


    public String getLongDescription() {
        return longDescription;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public HashMap<String, String> getDirection() {
        return direction;
    }

    public void setDirection(HashMap<String, String> direction) {
        this.direction = direction;
    }

    public void addDirection(String direction, String value){
        this.direction.put(direction, value);
    }

    public java.lang.Character getUser() {
        return user;
    }

    public void setUser(java.lang.Character user) {
        this.user = user;
    }


    public void roomDirections(String room){
        switch (room) {
            case "room1":
                addDirection("N", null);
                addDirection("S", null);
                addDirection("E", "room2");
                addDirection("W", "room3");

                break;
            case "room2":
                addDirection("N", null);
                addDirection("S", null);
                addDirection("E", null);
                addDirection("W", "room1");

                break;
            case "room3":
                addDirection("N", "room4");
                addDirection("S", null);
                addDirection("E", "room1");
                addDirection("W", null);

                break;
            case "room4":
                // no items
                addDirection("N", "room5");  // points to room 5

                addDirection("S", "room3");  // points to room 3

                addDirection("E", "room6");  // points to room 6

                addDirection("W", null);

                break;
            case "room5":
                addDirection("N", null);
                addDirection("S", "room4");  // points to room 4

                addDirection("E", null);
                addDirection("W", null);

                break;
            case "room6":
                addDirection("N", "room8"); // points to room 8 only if key is in inventory

                addDirection("S", null);
                addDirection("E", "room7"); // points to room 7 only if slippers are in inventory

                addDirection("W", "room4");  // points to room 4

                break;
            case "room7":
                addDirection("N", null);
                addDirection("S", null);
                addDirection("E", null);
                addDirection("W", "room6");  // points to room 6

                break;
            case "room8":
                addDirection("N", null);
                addDirection("S", null);
                addDirection("E", null);
                addDirection("W", null);


                break;
            default:
                break;
        }
    }


    public void roomItems(String room){
        switch (room) {
            case "room1":
                // No items in here
                this.addItems(null);
                //return this.roomData.getItems();
                break;
            case "room2":
                this.addItems("Shoe Room Key");
                //return this.roomData.getItems();
                break;
            case "room3":
                this.addItems("Soft Slippers");
                //return this.roomData.getItems();
                break;
            case "room4":
                // no items
                this.addItems(null);
                //return this.roomData.getItems();
                break;
            case "room5":
                this.addItems("Flashlight");
                //return this.roomData.getItems();
                break;
            case "room6":
                // no items in here
                this.addItems(null);
                //return this.roomData.getItems();
                break;
            case "room7":
                this.addItems("Guard Room - Padlock Key");
                //return this.roomData.getItems();
                break;
            case "room8":
                // no items
                this.addItems(null);
                //return this.roomData.getItems();
                break;
            default:
                //return this.roomData.getItems();
                break;
        }
    }

    public String nameOfRoom(String room){
        switch (room) {
            case "room1":
                return "Master Bedroom";
            case "room2":
                return "Bedroom Closet";
            case "room3":
                return "Shoe Room";
            case "room4":
                return "Hallway";
            case "room5":
                return "Utility Closet";
            case "room6":
                return "Guard Room";
            case "room7":
                return "Storage Room";
            case "room8":
                return "End";

            default:
                return "";
        }
    }

    public void setLongDescription(String room){
        switch (room) {
            case "room1":
                this.longDescription = ("You suddenly wake up and find yourself in a room full of cat paintings. " +
                        "You see two doors. One on each side of the room.");
                break;
            case "room2":
                this.longDescription = "You're in a walk-in closet, but you've never seen one so big. " +
                        "There's jewelry and other valuables all around. " +
                        "There's also a a bronze-looking key hanging on a hook.";
                break;
            case "room3":
                this.longDescription = "You're in a room full of shoes! " +
                        "\nAs you inspect the room, you can see racks of sneakers, boots and slippers up against " +
                        "the wall in front of you and on the wall to your left." +
                        " \nThis room has two doors.";
                break;
            case "room4":
                this.longDescription = "You find yourself in a long hallway with " +
                        "two doors. One at the end of the hallway and another door to the right of it. " +
                        "\nYou also notice a musty smell and which is probably emitting from the old couch to your left. " +
                        "\nMan, it looks like it hasn't been used in years!";
                break;
            case "room5":
                this.longDescription = "You're in a utility closet with some tools on the floor and some on the shelves. " +
                        "As you look around you spot a flashlight on the floor.";
                break;
            case "room6":
                this.longDescription = "Upon opening the door you see a guard. But it looks like he's asleep. " +
                        "\nYou'll need to be super quiet getting around him. You spot two other doors in this room.";
                break;
            case "room7":
                this.longDescription = "This room is pitch-black, you can't see a thing! You try flickering the light switch but nothing happens.";
                break;
            case "room8":
                this.longDescription = "You've escaped from the house!";
                break;
            default:
                this.longDescription = "";
        }
    }

    public void setShortDescription(String room){
        switch (room) {
            case "room1":
                this.shortDescription = "You're in the room you woke up in with the cat paintings.";
                break;
            case "room2":
                this.shortDescription = "You're in the large walk-in closet full of jewelry and other valuables.";
                break;
            case "room3":
                this.shortDescription = "It's a room full of shoes!";
                break;
            case "room4":
                this.shortDescription = "You're in that hallway with that musty old couch and three doors. ";
                break;
            case "room5":
                this.shortDescription = "You're in a utility closet with some tools on the floor and some on the shelves.";
                break;
            case "room6":
                this.shortDescription = "You're in a room with the sleeping guard and two doors. One door has a rather large padlock on it.";
                break;
            case "room7":
                this.shortDescription = "This room is pitch-black, you can't see a thing!";
                break;
            case "room8":
                this.shortDescription = "You've escaped from the house!";
                break;
            default:
                this.shortDescription = "";
        }

    }

}
