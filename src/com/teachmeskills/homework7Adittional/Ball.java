package com.teachmeskills.homework7Adittional;

public class Ball extends SolidOfRevolution{

    public Ball(double radius) {
        super(calculateVolume(radius), radius);
    }

    private static double calculateVolume(double radius){
        return 4 / 3d * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Ball";
    }
}
