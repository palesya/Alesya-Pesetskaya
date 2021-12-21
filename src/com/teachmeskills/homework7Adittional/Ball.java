package com.teachmeskills.homework7Adittional;

public class Ball extends SolidOfRevolution{
    public Ball(double radius) {
        super(4 / 3*Math.PI * Math.pow(radius, 3), radius);
    }

    @Override
    public String toString() {
        return "Ball";
    }
}
