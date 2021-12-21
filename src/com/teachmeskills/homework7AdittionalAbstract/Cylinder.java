package com.teachmeskills.homework7AdittionalAbstract;

public class Cylinder extends SolidOfRevolution {
    double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(getRadius(), 2)*height;
    }

    @Override
    public String toString() {
        return "Cylinder";
    }
}

