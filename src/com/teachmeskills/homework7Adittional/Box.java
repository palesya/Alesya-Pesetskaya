package com.teachmeskills.homework7Adittional;

import java.util.ArrayList;

public class Box extends Shape {
    double volume;

    private ArrayList<Shape> shapes = new ArrayList<>();

    public Box(double volume) {
        super(volume);
        this.volume = volume;
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
