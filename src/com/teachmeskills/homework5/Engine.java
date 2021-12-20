package com.teachmeskills.homework5;

public class Engine {
    public double engineCapacity;
    public int horsepower;
    Enum EngineType;

    public Engine(double engineCapacity, int horsepower, EngineType EngineType) {
        this.engineCapacity = engineCapacity;
        this.horsepower = horsepower;
        this.EngineType = EngineType;
    }

    public void increaseEngineSpeed() {
        System.out.println("Engine Speed is increasing.");
    }

    public void decreaseEngineSpeed() {
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
