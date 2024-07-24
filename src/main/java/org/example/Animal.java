package org.example;

public class Animal {
    private String name;
    private boolean isDog;

    // Default constructor
    public Animal() {
        this.name = "Unknown";
        this.isDog = false;
    }

    // Constructor with name only
    public Animal(String name) {
        this.name = name;
        this.isDog = false;
    }

    // Constructor with name and isDog
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    // Getters
    public String getName() {
        return name;
    }

    public boolean getIsDog() {
        return isDog;
    }

    // toString method
    @Override
    public String toString() {
        return name + " is a dog = " + isDog;
    }
}
