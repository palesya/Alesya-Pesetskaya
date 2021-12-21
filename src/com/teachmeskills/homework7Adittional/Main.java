package com.teachmeskills.homework7Adittional;

import com.teachmeskills.homework7_1.Animal;

public class Main {

    public static void main(String[] args) {

        Shape cylinder = new Cylinder(4.4, 2.5);
        Shape ball = new Ball(4.5);
        Shape pyramid = new Pyramid(9.2, 8.1);

        Box box = new Box(1000);
        Shape[] shapes = {cylinder, ball, pyramid};
//находим минимальный оъём элемента
        double minVolume = 0;
        for (Shape value : shapes) {
            minVolume = shapes[0].getVolume();
            if (value.getVolume() < minVolume) {
                minVolume = value.getVolume();
            }
        }
//заполняем контейнер пока не сможет вместиться элемент с минимальным объёмом
        while (minVolume <= box.volume) {
            for (Shape shape : shapes) {
                if (box.addShape(shape)) {
                    System.out.println(shape + " element with " + shape.getVolume() + " volume was added");
                }
            }
        }
//проверяем оставшийся объём
        System.out.println("___Volume left "+box.volume);
    }
}