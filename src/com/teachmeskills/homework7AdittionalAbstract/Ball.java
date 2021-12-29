package com.teachmeskills.homework7AdittionalAbstract;

public class Ball extends SolidOfRevolution {

    private static double calculateVolume(double radius){
        return 4 / 3d * Math.PI * Math.pow(radius, 3);
    }

    public Ball(double radius) {
        super(calculateVolume(radius), radius);
    }

    @Override
    public String toString() {
        return "Ball";
    }
}
