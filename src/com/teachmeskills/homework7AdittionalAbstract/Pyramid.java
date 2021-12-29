package com.teachmeskills.homework7AdittionalAbstract;

public class Pyramid extends Shape {
    double s;
    double h;

    public Pyramid(double s, double h) {
        super(calculateVolume(s, h));
        this.s = s;
        this.h = h;
    }

    private static double calculateVolume(double s, double h){
        return s*h/3;
    }

    @Override
    public String toString() {
        return "Pyramid";
    }
}
