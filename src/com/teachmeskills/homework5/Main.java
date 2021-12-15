package com.teachmeskills.homework5;

public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine(1.3, 200, EngineType.Petrol);
        Engine engine1 = new Engine(2.0, 300, EngineType.Electro);
        Headlights headlights = new Headlights(HeadlightType.Halogen, false);
        Transmission trasnsmission1 = new Transmission(Position.Neutral);
        Transmission trasnsmission2 = new Transmission(Position.Parking);
        Transmission trasnsmission3 = new Transmission(Position.Drive);
        Transmission trasnsmission4 = new Transmission(Position.Reverse);


    // создаем объект автомобиль
        System.out.println("--------------create Car object---------------");
        Car audi = new Car(engine, trasnsmission1, 10, Drive.FourWheel, headlights);
        Car mercedes = new Car(engine1, trasnsmission2, -15, Drive.FrontWheel, headlights);
        System.out.println("This is an audi car " + audi);
        System.out.println();

        //нажимаем на газ
        System.out.println("--------------push Gas Pedal---------------");
        System.out.println("Method pushGasPedal:");
        Car.pushGasPedal();
        System.out.println();

        //нажимаем на тормоз
        System.out.println("--------------push Break Pedal---------------");
        System.out.println("Method pushBreakPedal:");
        Car.pushBreakPedal();
        System.out.println();

        //включаем фары
        System.out.println("--------------turn Headlights on---------------");
        audi.turnCarHeadlightsOn();
        System.out.println("This is an audi car with Headlights turned on" + audi);
        System.out.println();

        //меняем поворот руля
        System.out.println("--------------change rudderAngle---------------");
        audi.turnSteeringWheel();
        System.out.println("This is an audi car with changed rudderAngle " + audi);
        System.out.println();

// переключаем передачу
        System.out.println("--------------change Position---------------");
        audi.changePosition();
        System.out.println("This is an audi car with new Drive position " + audi);
    }
}
