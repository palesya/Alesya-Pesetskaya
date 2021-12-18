package com.teachmeskills.homework6;

import java.util.Scanner;

public class CivilTransport extends AirTransport {
    int planePassengersNumber;
    boolean businessClass;

    public CivilTransport(int capacityHorsepower, int maxSpeedKmPerHour, int weight, String brand, double wingspanMetres, int minRunwayLengthMetres, int planePassengersNumber, boolean businessClass) {
        super(capacityHorsepower, maxSpeedKmPerHour, weight, brand, wingspanMetres, minRunwayLengthMetres);
        this.planePassengersNumber = planePassengersNumber;
        this.businessClass = businessClass;
    }

    @Override
    public String toString() {
        return "Brand: " + brand +
                "; Capacity in horsepower: " + capacityHorsepower +
                "; Maximum speed in Km/Hour: " + maxSpeedKmPerHour +
                "; Weight in kilos: " + weightKilos +
                "; Wingspan in metres: " + wingspanMetres +
                "; Minimum runway length in metres: " + minRunwayLengthMetres +
                "; Number of passengers: " + planePassengersNumber +
                "; Is business class allowed: " + businessClass;
    }

    public void print() {
        System.out.print(this);
        countCapacityKilowatts();
        System.out.println();
    }

    public void countPassengers() {
        boolean intEntered = false;
        int passengers=0;
        while (!intEntered) {
            System.out.println("Введите количество пассажиров");
            Scanner scanner = new Scanner(System.in);
            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка ввода. Введите целое положительное число.");
            } else {
                passengers = scanner.nextInt();
                if (passengers < 0) {
                    System.out.println("Ошибка ввода. Введите целое положительное число.");
                } else {
                    intEntered = true;
                }
            }
        }
        if (passengers <= planePassengersNumber) {
            System.out.println("Самолёт загружен");
        } else {
            System.out.println("Вам нужен самолёт побольше");
        }
    }
}
