package com.teachmeskills.homework6;

import java.util.Scanner;

public class FreightTransport extends LandTransport {
    private int liftingCapacityTons;

    public FreightTransport(int capacityHorsepower, int maxSpeedKmPerHour, int weight, String brand, int wheelNumber, double fuelConsumptionLPer100km, int liftingCapacityTons) {
        super(capacityHorsepower, maxSpeedKmPerHour, weight, brand, wheelNumber, fuelConsumptionLPer100km);
        this.liftingCapacityTons = liftingCapacityTons;
    }

    @Override
    public String toString() {
        return "Brand: " + getBrand() +
                "; Capacity in horsepower: " + getCapacityHorsepower() +
                "; Maximum speed in Km/Hour: " + getMaxSpeedKmPerHour() +
                "; Weight in kilos: " + getWeightKilos() +
                "; Number of wheels: " + getWheelNumber() +
                "; Fuel consumption in l/100km: " + getFuelConsumptionLPer100km() +
                "; lifting capacity in tons: " + liftingCapacityTons;
    }

    public void print() {
        System.out.print(this);
        countCapacityKilowatts();
        System.out.println();
    }

    public void checkCapacity(int weight) {
        if (weight <= liftingCapacityTons) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}

