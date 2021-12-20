package com.teachmeskills.homework5;

import static com.teachmeskills.homework5.Car.*;

public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine(1.3, 200, EngineType.PETROL);
        Engine engine1 = new Engine(2.0, 300, EngineType.ELECTRO);
        Headlights headlights = new Headlights(HeadlightType.HALOGEN, false);
        Transmission trasnsmission1 = new Transmission(Position.NEUTRAL);
        Transmission trasnsmission2 = new Transmission(Position.PARKING);
        Transmission trasnsmission3 = new Transmission(Position.DRIVE);
        Transmission trasnsmission4 = new Transmission(Position.REVERSE);


        // создаем объект автомобиль
        System.out.println("--------------create Car object---------------");
        Car audi = new Car(engine, trasnsmission1, 10, Wheel.FOUR_WHEEL, headlights);
        Car mercedes = new Car(engine1, trasnsmission2, -15, Wheel.FRONT_WHEEL, headlights);
        System.out.println("This is an audi car " + audi);
        System.out.println();

        //нажимаем на газ
        System.out.println("--------------push Gas Pedal---------------");
        System.out.println("Method pushGasPedal:");
        audi.pushGasPedal();
        System.out.println();

        //нажимаем на тормоз
        System.out.println("--------------push Break Pedal---------------");
        System.out.println("Method pushBreakPedal:");
        audi.pushBreakPedal();
        System.out.println();

        //включаем фары
        System.out.println("--------------turn Headlights on---------------");
        audi.turnCarHeadlightsOn();
        System.out.println("This is an audi car with Headlights turned on" + audi);
        System.out.println();

        //меняем поворот руля
        System.out.println("--------------change rudderAngle---------------");
        if (audi.turnSteeringWheel(10)) {
            System.out.println("This is an audi car with turned rudderAngle " + audi);
        }
        System.out.println();

// переключаем передачу
        System.out.println("--------------change Position---------------");

        if (audi.changePosition(Position.PARKING)) {
            System.out.println("This is an audi car with new Drive position " + audi);
        }
    }
}
