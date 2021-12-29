package com.teachmeskills.homework6;

import java.util.Scanner;

public class LightTransport extends LandTransport {

    private String bodyType;
    private int carPassangersNumber;

    public LightTransport(int capacityHorsepower, int maxSpeedKmPerHour, int weight, String brand, int wheelNumber, double fuelConsumptionLPer100km, String bodyType, int carPassangersNumber) {
        super(capacityHorsepower, maxSpeedKmPerHour, weight, brand, wheelNumber, fuelConsumptionLPer100km);
        this.bodyType = bodyType;
        this.carPassangersNumber = carPassangersNumber;
    }

    @Override
    public String toString() {
        return "Brand: " + getBrand() +
                "; Capacity in horsepower: " + getCapacityHorsepower() +
                "; Maximum speed in Km/Hour: " + getMaxSpeedKmPerHour() +
                "; Weight in kilos: " + getWeightKilos() +
                "; Number of wheels: " + getWheelNumber() +
                "; Fuel consumption in l/100km: " + getFuelConsumptionLPer100km() +
                "; Type of Body: " + bodyType +
                "; Number of passangers: " + carPassangersNumber;
    }

    public void print() {
        System.out.print(this);
        countCapacityKilowatts();
        System.out.println();
    }

    public void countKmWithMaxSpeed(int hours) {
        int kmWithMaxSpeed = hours * getMaxSpeedKmPerHour();
        double consumedFuel = consumeFuelWithMaxSpeed(kmWithMaxSpeed);
        System.out.println("За время " + hours + " ч, автомобиль " +  getBrand()+
                " двигаясь с максимальной скоростью " + getMaxSpeedKmPerHour() + " км/ч проедет " +
                kmWithMaxSpeed + " км и израсходует " + consumedFuel + " литров топлива.");
    }


    private double consumeFuelWithMaxSpeed(int kmWithMaxSpeed) {
        return kmWithMaxSpeed * getFuelConsumptionLPer100km() / 100;
    }
}

