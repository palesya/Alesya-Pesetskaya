package com.teachmeskills.homework7Adittional;

import com.teachmeskills.homework7_1.Animal;

public class Main {

    public static void main(String[] args) {

        Shape cylinder = new Cylinder(1.3, 2.2);
        Shape ball = new Ball(1.5);
        Shape pyramid = new Pyramid(6.5, 5.1);

        Box box = new Box(1000);
        Shape[] shapes = {cylinder, ball, pyramid};

        for (Shape shape : shapes) {
            if (!box.addShape(shape)) {
                System.out.println(shape+ " element with "+ shape.getVolume()+" volume was not added");
                break;
            }else{
                System.out.println(shape+ " element with "+ shape.getVolume()+" volume was added");
            }
        }
    }
}