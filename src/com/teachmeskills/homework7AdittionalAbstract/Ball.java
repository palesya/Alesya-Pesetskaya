package com.teachmeskills.homework7AdittionalAbstract;

public class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super(radius);
    }

    @Override
    public double getVolume() {
        return (4/3)*Math.PI * Math.pow(getRadius(), 3);
    }

    @Override
    public String toString() {
        return "Ball";
    }
}
