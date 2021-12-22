package com.teachmeskills.homework7_1;

public abstract class Animal {
String food;
String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public abstract void makeNoise();
    public abstract void eat();
    public String sleep(Animal animal){
        return animal+" спит";
    }

}


