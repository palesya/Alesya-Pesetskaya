package com.teachmeskills.homework7_2;

import java.awt.*;

public class Circle extends Shape{

    private int centerX;
    private int centerY;
    private int radius;

    public Circle(Color color, int centerX, int centerY, int radius) {
        super(color);
        this.centerX = centerX;
        this.centerY = centerY;
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
        return centerX == circle.centerX && centerY == circle.centerY && radius == circle.radius;
    }


    @Override
    public String toString() {
        return "Круг: " +
                "Координата центра по оси Х=" + centerX +
                ", координата центра по оси Y=" + centerY +
                ", радиус круга=" + radius +
                ", цвет=" + getColor();
    }
}
