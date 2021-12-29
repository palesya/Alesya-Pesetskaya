package com.teachmeskills.homework7AdittionalAbstract;

public abstract class SolidOfRevolution extends Shape {
    public double radius;

    public SolidOfRevolution(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }
}


