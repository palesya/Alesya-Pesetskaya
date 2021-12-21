package com.teachmeskills.homework7Adittional;

public class Cylinder extends SolidOfRevolution{
    double height;

    public Cylinder(double radius, double height) {
        super(Math.PI * Math.pow(radius, 2)*height, radius);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder";

    }
}

