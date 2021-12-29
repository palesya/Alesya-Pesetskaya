package com.teachmeskills.homework7Adittional;

import java.util.ArrayList;

public class Box extends Shape {

    private ArrayList<Shape> shapes = new ArrayList<>();

    public Box(double volume) {
        super(volume);
    }

    public double boxCapacity= this.volume;
    public boolean addShape(Shape shape) {
        if (boxCapacity>= shape.volume) {
            shapes.add(shape);
            boxCapacity-=shape.volume;
            return true;
        } else {
            return false;
        }
    }



}
