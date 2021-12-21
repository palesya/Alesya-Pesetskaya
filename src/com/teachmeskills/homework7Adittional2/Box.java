package com.teachmeskills.homework7Adittional2;

import java.util.ArrayList;

public class Box extends Shape {
    double volume;

    private ArrayList<Shape> shapes = new ArrayList<>();

    public Box(double volume) {
        this.volume = volume;
    }

    @Override
    public double getVolume() {
        return volume;
    }

    public boolean addShape(Shape shape) {
        if (volume >= shape.getVolume()) {
            shapes.add(shape);
            volume -=shape.getVolume();
            return true;
        } else {
            return false;
        }
    }



}
