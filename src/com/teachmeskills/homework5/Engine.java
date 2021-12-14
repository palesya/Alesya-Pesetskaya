package com.teachmeskills.homework5;

import static com.teachmeskills.homework5.EngineType.Diesel;
import static com.teachmeskills.homework5.EngineType.Petrol;

public class Engine {
    public double engineCapacity;
    public int horsepower;
    Enum EngineType;

    public Engine(double engineCapacity, int horsepower, Enum EngineType) {
        this.engineCapacity = engineCapacity;
        this.horsepower = horsepower;
        this.EngineType = EngineType;
    }

    public static void increaseEngineSpeed() {
        System.out.println("Engine Speed is increasing.");
    }

    public static void decreaseEngineSpeed() {
        System.out.println("Engine Speed is decreasing.");
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineCapacity=" + engineCapacity +
                ", horsepower=" + horsepower +
                ", EngineType=" + EngineType +
                '}';
    }
}
