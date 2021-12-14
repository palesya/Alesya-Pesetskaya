package com.teachmeskills.homework5;

public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine(1.3, 200, EngineType.Petrol);
        Headlights headlights = new Headlights(HeadlightType.Halogen, false);
        Transmission trasnsmission1 = new Transmission(Position.Neutral);
        Transmission trasnsmission2 = new Transmission(Position.Parking);
        Transmission trasnsmission3 = new Transmission(Position.Drive);
        Transmission trasnsmission4 = new Transmission(Position.Reverse);
        Car audi = new Car(engine, trasnsmission1, 10, Drive.FourWheel, headlights);

        System.out.println("This is an audi car " + audi);
        System.out.println("Method pushGasPedal:");
        Car.pushGasPedal();
        System.out.println("Method pushBreakPedal:");
        Car.pushBreakPedal();

    }
}
