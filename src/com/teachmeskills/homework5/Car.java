package com.teachmeskills.homework5;

import java.util.Arrays;

import static com.teachmeskills.homework5.Drive.FrontWheel;

public class Car {
    private Engine engines;
    private Transmission transmissions;
    public int rudderAngle;
    Enum Drive;
    private Headlights headlights;

    public Car(Engine engines, Transmission transmissions, int rudderAngle, Enum drive, Headlights headlights) {
        this.engines = engines;
        this.transmissions = transmissions;
        this.rudderAngle = rudderAngle;
        this.headlights = headlights;
    }

    public static void pushGasPedal() {
        Engine.increaseEngineSpeed();
    }

    public static void pushBreakPedal() {
        Engine.decreaseEngineSpeed();
    }

    @Override
    public String toString() {
        return "Car{" +
                "engines=" + engines +
                ", transmissions=" + transmissions +
                ", rudderAngle=" + rudderAngle +
                ", Drive=" + Drive +
                ", headlights=" + headlights +
                '}';
    }
}



