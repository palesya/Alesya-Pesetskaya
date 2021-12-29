package com.teachmeskills.homework7_1;

public abstract class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public abstract void makeNoise();

    public abstract void eat();

    public void sleep() {
        System.out.println(Animal.this+ " спит");
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

}


