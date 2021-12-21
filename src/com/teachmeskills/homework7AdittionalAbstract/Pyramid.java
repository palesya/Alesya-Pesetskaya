package com.teachmeskills.homework7AdittionalAbstract;

public class Pyramid extends Shape {
    double s;
    double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
    }

    @Override
    public double getVolume() {
        return s*h/3;
    }

    @Override
    public String toString() {
        return "Pyramid";
    }
}
