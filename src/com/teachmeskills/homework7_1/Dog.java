package com.teachmeskills.homework7_1;

public class Dog extends Animal{
    boolean trained;
    int walksPerDay;

    public Dog(String food, String location, boolean trained, int walksPerDay) {
        super(food, location);
        this.trained = trained;
        this.walksPerDay = walksPerDay;
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака лает");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест "+this.food);
    }

    @Override
    public String toString() {
        return "Собака";
    }
}
