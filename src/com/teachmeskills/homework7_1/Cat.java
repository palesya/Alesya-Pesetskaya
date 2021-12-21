package com.teachmeskills.homework7_1;

public class Cat extends Animal{
    boolean vaccination;
    String coatType;
    String breed;

    public Cat(String food, String location, boolean vaccination, String coatType, String breed) {
        super(food, location);
        this.vaccination = vaccination;
        this.coatType = coatType;
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кошка мяукает");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест "+this.food);
    }
    @Override
    public String toString() {
        return "Кошка";
    }
}
