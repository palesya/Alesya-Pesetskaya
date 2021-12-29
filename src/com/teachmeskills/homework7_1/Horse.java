package com.teachmeskills.homework7_1;

public class Horse extends Animal {
    private boolean horseshoes;
    private String assignment;

    public Horse(String food, String location, boolean horseshoes, String assignment) {
        super(food, location);
        this.horseshoes = horseshoes;
        this.assignment = assignment;
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь ржет");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест " +this.getFood());
    }

    @Override
    public String toString() {
        return "Лошадь";
    }

}
