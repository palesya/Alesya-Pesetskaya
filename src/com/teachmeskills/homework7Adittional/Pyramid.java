package com.teachmeskills.homework7Adittional;

public class Pyramid extends Shape{
    double s;
    double h;

    public Pyramid(double s, double h) {
        super(s*h/3);
        this.s = s;
        this.h = h;
    }

    @Override
    public String toString() {
        return "Pyramid";

    }
}
