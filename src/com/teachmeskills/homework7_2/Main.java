package com.teachmeskills.homework7_2;

import com.teachmeskills.homework7_1.Animal;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shape circle=new Circle(Color.BLACK,1,2,3);
        Shape rectangle=new Rectangle(Color.RED,1,1,5,5,3,5);

        Shape[] shapes = {circle,rectangle};

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
