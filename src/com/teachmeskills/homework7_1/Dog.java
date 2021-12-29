package com.teachmeskills.homework7_1;

public class Dog extends Animal{
    private boolean trained;
    private int walksPerDay;

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
        System.out.println("Собака ест "+this.getFood());
    }

    @Override
    public String toString() {
        return "Собака";
    }
}
