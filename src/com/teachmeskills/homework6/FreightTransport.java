package com.teachmeskills.homework6;

import java.util.Scanner;

public class FreightTransport extends LandTransport {
    int liftingCapacityTons;

    public FreightTransport(int capacityHorsepower, int maxSpeedKmPerHour, int weight, String brand, int wheelNumber, double fuelConsumptionLPer100km, int liftingCapacityTons) {
        super(capacityHorsepower, maxSpeedKmPerHour, weight, brand, wheelNumber, fuelConsumptionLPer100km);
        this.liftingCapacityTons = liftingCapacityTons;
    }

    @Override
    public String toString() {
        return "Brand: " + brand +
                "; Capacity in horsepower: " + capacityHorsepower +
                "; Maximum speed in Km/Hour: " + maxSpeedKmPerHour +
                "; Weight in kilos: " + weightKilos +
                "; Number of wheels: " + wheelNumber +
                "; Fuel consumption in l/100km: " + fuelConsumptionLPer100km +
                "; lifting capacity in tons: " + liftingCapacityTons;
    }

    public void print() {
        System.out.print(this);
        countCapacityKilowatts();
        System.out.println();
    }

    public void checkCapacity() {
        boolean intEntered = false;
        int weight=0;
        while (!intEntered) {
            System.out.println("Введите количество груза в тоннах");
            Scanner scanner = new Scanner(System.in);
            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка ввода. Введите целое положительное число.");
            } else {
                weight = scanner.nextInt();
                if (weight < 0) {
                    System.out.println("Ошибка ввода. Введите целое положительное число.");
                } else {
                    intEntered = true;
                }
            }
        }
        if (weight <= liftingCapacityTons) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}

