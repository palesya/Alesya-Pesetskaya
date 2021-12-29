package com.teachmeskills.homework7AdittionalAbstract;

public class Main {

    public static void main(String[] args) {

        Shape cylinder = new Cylinder(4.4, 2.5);
        Shape ball = new Ball(2.4);
        Shape pyramid = new Pyramid(9.2, 8.1);

        Box box = new Box(1000);
        Shape[] shapes = {cylinder, ball, pyramid};
//находим минимальный оъём элемента
        double minVolume = 0;
        for (Shape value : shapes) {
            minVolume = shapes[0].volume;
            if (value.volume< minVolume) {
                minVolume = value.volume;
            }
        }
//заполняем контейнер пока не сможет вместиться элемент с минимальным объёмом
        while (minVolume <= box.boxCapacity) {
            for (Shape shape : shapes) {
                if (box.addShape(shape)) {
                    System.out.println(shape + " element with " + String.format("%.2f",shape.volume) + " volume was added");
                }
            }
        }
//проверяем оставшийся объём
        System.out.println("___Volume left "+String.format("%.2f",box.boxCapacity));
    }
}