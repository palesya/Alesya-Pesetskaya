package com.teachmeskills.homework7_2;

import java.awt.*;
import java.util.Arrays;

public class Rectangle extends Shape{

    int[] topA;
    int[] topB;
    int[] topC;

    public Rectangle(Color color, int[] topA, int[] topB, int[] topC) {
        super(color);
        this.topA = topA;
        this.topB = topB;
        this.topC = topC;
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
        Rectangle rectangle = (Rectangle) o;
        return Arrays.equals(topA, rectangle.topA) && Arrays.equals(topB, rectangle.topB) && Arrays.equals(topC, rectangle.topC);
    }

    @Override
    public String toString() {
        return "Треугольник: " +
                "Координаты вершины A=" + Arrays.toString(topA) +
                ", координаты вершины B=" + Arrays.toString(topB) +
                ", координаты вершины C=" + Arrays.toString(topC) +
                ", цвет=" + color;
    }
}
