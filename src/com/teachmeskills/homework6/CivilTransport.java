package com.teachmeskills.homework6;

import java.util.Scanner;

public class CivilTransport extends AirTransport {
    private int planePassengersNumber;
    private boolean businessClass;

    public CivilTransport(int capacityHorsepower, int maxSpeedKmPerHour, int weight, String brand, double wingspanMetres, int minRunwayLengthMetres, int planePassengersNumber, boolean businessClass) {
        super(capacityHorsepower, maxSpeedKmPerHour, weight, brand, wingspanMetres, minRunwayLengthMetres);
        this.planePassengersNumber = planePassengersNumber;
        this.businessClass = businessClass;
    }

    @Override
    public String toString() {
        return "Brand: " + getBrand() +
                "; Capacity in horsepower: " + getCapacityHorsepower() +
                "; Maximum speed in Km/Hour: " + getMaxSpeedKmPerHour() +
                "; Weight in kilos: " + getWeightKilos() +
                "; Wingspan in metres: " + getWingspanMetres() +
                "; Minimum runway length in metres: " + getMinRunwayLengthMetres() +
                "; Number of passengers: " + planePassengersNumber +
                "; Is business class allowed: " + businessClass;
    }

    public void print() {
        System.out.print(this);
        countCapacityKilowatts();
        System.out.println();
    }

    public void countPassengers(int passengers) {
        if (passengers <= planePassengersNumber) {
            System.out.println("Самолёт загружен");
        } else {
            System.out.println("Вам нужен самолёт побольше");
        }
    }
}
