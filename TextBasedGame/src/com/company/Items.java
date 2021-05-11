package com.company;

import java.util.ArrayList;

public class Items {
    ArrayList<String> items = new ArrayList<>();
    ArrayList<String> roomItems = new ArrayList<>();

    public Items(){

    }

    public void addItems(Character user, String item){
        System.out.println(user.getName() + " received " + item);
        this.items.add(item);
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void printItems(){
        System.out.println("Your inventory:");
        for(String item : this.items){
            System.out.println(item);
        }
    }

}
