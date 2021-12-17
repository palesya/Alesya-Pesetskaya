package com.teachmeskills.homework6;

import java.util.Scanner;

public class LightTransport extends LandTransport {

    String bodyType;
    int carPassangersNumber;

    public LightTransport(int capacityHorsepower, int maxSpeedKmPerHour, int weight, String brand, int wheelNumber, double fuelConsumptionLPer100km, String bodyType, int carPassangersNumber) {
        super(capacityHorsepower, maxSpeedKmPerHour, weight, brand, wheelNumber, fuelConsumptionLPer100km);
        this.bodyType = bodyType;
        this.carPassangersNumber = carPassangersNumber;
    }

    @Override
    public String toString() {
        return "Brand: " + brand +
                "; Capacity in horsepower: " + capacityHorsepower +
                "; Maximum speed in Km/Hour: " + maxSpeedKmPerHour +
                "; Weight in kilos: " + weightKilos +
                "; Number of wheels: " + wheelNumber +
                "; Fuel consumption in l/100km: " + fuelConsumptionLPer100km +
                "; Type of Body: " + bodyType +
                "; Number of passangers: " + carPassangersNumber;
    }

    public void print() {
        System.out.print(this);
        countCapacityKilowatts();
        System.out.println();
    }

    public void countKmWithMaxSpeed() {
        boolean intEntered = false;
        int hours;
        while (!intEntered) {
            System.out.println("Введите время движения автомобиля");
            Scanner scanner = new Scanner(System.in);
            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка ввода. Введите целое положительное число.");
            } else {
                hours = scanner.nextInt();
                if (hours < 0) {
                    System.out.println("Ошибка ввода. Введите целое положительное число.");
                } else {
                    intEntered = true;
                    int kmWithMaxSpeed = hours * maxSpeedKmPerHour;
                    double consumedFuel = consumeFuelWithMaxSpeed(kmWithMaxSpeed);
                    System.out.println("За время " + hours + " ч, автомобиль " + brand + " двигаясь с максимальной скоростью " + maxSpeedKmPerHour + " км/ч проедет " + kmWithMaxSpeed + " км и израсходует " + consumedFuel + " литров топлива.");
                }
            }
        }
    }


    private double consumeFuelWithMaxSpeed(int kmWithMaxSpeed) {
        return kmWithMaxSpeed * fuelConsumptionLPer100km / 100;
    }
}

