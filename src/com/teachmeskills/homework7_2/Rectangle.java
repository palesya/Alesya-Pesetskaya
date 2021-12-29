package com.teachmeskills.homework7_2;

import java.awt.*;
import java.util.Arrays;
import java.util.Objects;

public class Rectangle extends Shape{

    private int topAX;
    private int topAY;
    private int topBX;
    private int topBY;
    private int topCX;
    private int topCY;

    public Rectangle(Color color, int topAX, int topAY, int topBX, int topBY, int topCX, int topCY) {
        super(color);
        this.topAX = topAX;
        this.topAY = topAY;
        this.topBX = topBX;
        this.topBY = topBY;
        this.topCX = topCX;
        this.topCY = topCY;
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
        return topAX == rectangle.topAX && topAY == rectangle.topAY && topBX == rectangle.topBX && topBY == rectangle.topBY && topCX == rectangle.topCX && topCY == rectangle.topCY;
    }


    @Override
    public String toString() {
        return "Треугольник: " +
                "Координаты вершины A по оси X=" + topAX +
                ", по оси Y=" + topAY +
                ". Координаты вершины B по оси X=" + topBX +
                ", по оси Y=" + topBY +
                ". Координаты вершины C по оси X=" + topCX +
                ", по оси Y=" + topCY +
                ", цвет=" + getColor();
    }
}
