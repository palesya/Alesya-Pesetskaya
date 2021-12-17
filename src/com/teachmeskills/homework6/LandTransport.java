package com.teachmeskills.homework6;

public abstract class LandTransport extends Transport{
    int wheelNumber;
    double fuelConsumptionLPer100km;

    public LandTransport(int capacityHorsepower, int maxSpeedKmPerHour, int weight, String brand, int wheelNumber, double fuelConsumptionLPer100km) {
        super(capacityHorsepower, maxSpeedKmPerHour, weight, brand);
        this.wheelNumber = wheelNumber;
        this.fuelConsumptionLPer100km = fuelConsumptionLPer100km;
    }

}
