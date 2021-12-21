package com.teachmeskills.homework7_2;

import java.awt.*;
import java.util.Arrays;

public class Circle extends Shape{

    int[] Center;
    int radius;

    public Circle(Color color, int[] center, int radius) {
        super(color);
        Center = center;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius && Arrays.equals(Center, circle.Center);
    }

    @Override
    public String toString() {
        return "Круг: " +
                "Координаты центра=" + Arrays.toString(Center) +
                ", радиус круга=" + radius +
                ", цвет=" + color;
    }
}
