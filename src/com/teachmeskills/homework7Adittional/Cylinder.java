package com.teachmeskills.homework7Adittional;

public class Cylinder extends SolidOfRevolution{
    private double height;

    public Cylinder(double radius, double height) {
        super(calculateVolume(radius, height), radius);
        this.height = height;
    }

    private static double calculateVolume(double radius, double height){
        return Math.PI * Math.pow(radius, 2)*height;
    }

    @Override
    public String toString() {
        return "Cylinder";

    }
}

