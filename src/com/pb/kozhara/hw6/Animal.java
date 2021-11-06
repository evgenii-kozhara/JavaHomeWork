package com.pb.kozhara.hw6;

public class Animal {
    private String name;
    private String food;
    private String location;

    public Animal(String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;
    }
    public String getName() {
        return name;
    }
    public String getFood() {
        return food;
    }
    public String getLocation() {
        return location;
    }
    public void makeNoise() {
        System.out.printf("\n%s говорить %s", name);
    }
    public void sleep() {
        System.out.println("Животное спит");
    }
}
