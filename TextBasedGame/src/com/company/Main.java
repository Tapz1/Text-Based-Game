package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Locale;
import java.util.Scanner;

import java.io.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*The main game method*/
        letsPlay();
    }

    public static void promptEnterKey(){
        System.out.println("Press \"ENTER\" to continue...");
        Scanner input = new Scanner(System.in);
        input.nextLine();
    }



    public static void letsPlay(){
        BufferedReader fileIn;
        BufferedWriter fileOut;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter name: ");
        String userName = in.next();



        Items userItems = new Items();

        Character user = new Character(userName, userItems);

        // sets each run through from the beginning
        String roomName = "room1";

        /* setting up the first room object */
        RoomData newRoom = new RoomData();

        newRoom.nameOfRoom(roomName);
        newRoom.setLongDescription(roomName);
        newRoom.setShortDescription(roomName);
        newRoom.roomItems(roomName);
        newRoom.roomDirections(roomName);
        user.addRoom(roomName);

        System.out.println("---Game Start---");
        promptEnterKey();
        System.out.println(newRoom.getLongDescription());
        promptEnterKey();
        System.out.println("Enter what you would like to do \n(enter 'm' to view menu of options)");

        boolean isRunning = true;
        while(isRunning){

            String choice = in.next();
            switch ((choice).toUpperCase(Locale.ROOT)){
                case "M":
                    newRoom.menu();
                    break;
                case "N":
                    // north direction
                    try {
                        roomName = newRoom.getDirection().get("N"); // pulls the val of where room points

                        /** these ifs look for locked doors **/
                        if(roomName.equals("room4") && !userItems.getItems().contains("Shoe Room Key")){
                            System.out.println("Door's locked. Need to find a key.");
                            break;
                        }else if(roomName.equals("room6") && !userItems.getItems().contains("Soft Slippers")){
                            System.out.println("'There's someone there, I'll need to find a way to sneak through'");
                            break;
                        }else if(roomName.equals("room8") && !userItems.getItems().contains("Guard Room - Padlock Key")){
                            System.out.println("Door's locked. Need to find a key.");
                            break;
                        }

                        //System.out.println("Switching to: " + roomName);  // testing purposes
                        /** generates the new room object **/
                        newRoom = new RoomData();
                        System.out.println("You are now in " + newRoom.nameOfRoom(roomName));
                        newRoom.setLongDescription(roomName);
                        newRoom.setShortDescription(roomName);
                        newRoom.roomItems(roomName);
                        newRoom.roomDirections(roomName);

                        if(!user.getRooms().contains(roomName)){
                            System.out.println(newRoom.getLongDescription());
                            user.addRoom(roomName);
                        }
                        if(roomName.equals("room8")){
                            isRunning = false;
                        }
                    }catch (NullPointerException nullExc){
                        System.out.println("Can't go in that direction");
                    }

                    break;
                case "E":
                    try {
                        roomName = newRoom.getDirection().get("E");
                        if(roomName.equals("room4") && !userItems.getItems().contains("Shoe Room Key")){
                            System.out.println("Door's locked. Need to find a key.");
                            break;
                        }else if(roomName.equals("room6") && !userItems.getItems().contains("Soft Slippers")){
                            System.out.println("'There's someone there, I'll need to find a way to sneak through'");
                            break;
                        }else if(roomName.equals("room8") && !userItems.getItems().contains("Guard Room - Padlock Key")){
                            System.out.println("Door's locked. Need to find a key.");
                            break;
                        }

                        //System.out.println("Switching to: " + roomName);   // testing purposes
                        newRoom = new RoomData();
                        System.out.println("You are now in " + newRoom.nameOfRoom(roomName));
                        newRoom.setLongDescription(roomName);
                        newRoom.setShortDescription(roomName);
                        newRoom.roomItems(roomName);
                        newRoom.roomDirections(roomName);
                        if(!user.getRooms().contains(roomName)){
                            System.out.println(newRoom.getLongDescription());
                            user.addRoom(roomName);
                        }
                        if(roomName.equals("room8")){
                            isRunning = false;
                        }
                    }catch (NullPointerException nullExc){
                        System.out.println("Can't go in that direction");
                    }
                    break;
                case "S":
                    try {
                        roomName = newRoom.getDirection().get("S");

                        if(roomName.equals("room4") && !userItems.getItems().contains("Shoe Room Key")){
                            System.out.println("Door's locked. Need to find a key.");
                            break;
                        }else if(roomName.equals("room6") && !userItems.getItems().contains("Soft Slippers")){
                            System.out.println("'There's someone there, I'll need to find a way to sneak through'");
                            break;
                        }else if(roomName.equals("room8") && !userItems.getItems().contains("Guard Room - Padlock Key")){
                            System.out.println("Door's locked. Need to find a key.");
                            break;
                        }

                        //System.out.println("Switching to: " + roomName);    // testing purposes

                        newRoom = new RoomData();
                        System.out.println("You are now in " + newRoom.nameOfRoom(roomName));
                        newRoom.setLongDescription(roomName);
                        newRoom.setShortDescription(roomName);
                        newRoom.roomItems(roomName);
                        newRoom.roomDirections(roomName);
                        if(!user.getRooms().contains(roomName)){
                            System.out.println(newRoom.getLongDescription());
                            user.addRoom(roomName);
                        }
                        if(roomName.equals("room8")){
                            isRunning = false;
                        }
                    }catch (NullPointerException nullExc){
                        System.out.println("Can't go in that direction");
                    }

                    break;
                case "W":
                    try {
                        roomName = newRoom.getDirection().get("W");

                        if(roomName.equals("room4") && !userItems.getItems().contains("Shoe Room Key")){
                            System.out.println("Door's locked. Need to find a key.");
                            break;
                        }else if(roomName.equals("room6") && !userItems.getItems().contains("Soft Slippers")){
                            System.out.println("'There's someone there, I'll need to find a way to sneak through'");
                            break;
                        }else if(roomName.equals("room8") && !userItems.getItems().contains("Guard Room - Padlock Key")){
                            System.out.println("Door's locked. Need to find a key.");
                            break;
                        }

                        //System.out.println("Switching to: " + roomName);    // testing purposes

                        newRoom = new RoomData();
                        System.out.println("You are now in " + newRoom.nameOfRoom(roomName));
                        newRoom.setLongDescription(roomName);
                        newRoom.setShortDescription(roomName);
                        newRoom.roomItems(roomName);
                        newRoom.roomDirections(roomName);
                        if(!user.getRooms().contains(roomName)){
                            System.out.println(newRoom.getLongDescription());
                            user.addRoom(roomName);
                        }
                        if(roomName.equals("room8")){
                            isRunning = false;
                        }
                    }catch (NullPointerException nullExc){
                        System.out.println("Can't go in that direction");
                    }
                    break;
                case "GET":
                    if(userItems.getItems().contains(newRoom.getItems()[0])){
                        newRoom.getItems()[0] = null;
                    }
                    if(newRoom.getItems()[0] == null){
                        System.out.println("No items in here");
                    }else{
                        if(roomName.equals("room7") && !userItems.getItems().contains("Flashlight")){
                            System.out.println("'Can't see a thing, I'll need to find a flashlight'");
                        }else {
                            String item = newRoom.getItems()[0];
                            userItems.addItems(user, item);
                        }
                    }

                    break;
                case "I":
                    if(userItems.getItems().isEmpty()){
                        System.out.println("You don't have any items!");
                    }else{
                        userItems.printItems();
                    }
                    break;
                case "ROOM":
                    System.out.println(newRoom.nameOfRoom(roomName));
                    break;
                case "MORE":
                    System.out.println(newRoom.getShortDescription());
                    break;
                case "EXIT":
                    isRunning = false;
                    break;
                default:
                    System.out.println("That wasn't a valid input.");
                    break;
            }

        }
    }

}


