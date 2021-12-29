package com.teachmeskills.homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        LightTransport lightTransport = new LightTransport(200, 180, 1600, "Renault", 4, 10, "Hatchback", 5);
        FreightTransport freightTransport = new FreightTransport(300, 140, 6000, "MAZ", 6, 20, 10);
        CivilTransport civilTransport = new CivilTransport(50000, 1300, 430000, "Airbus", 79, 2300, 568, true);
        MilitaryTransport militaryTransport = new MilitaryTransport(90000, 850, 250000, "AN", 88.4, 500, true, 20);

        lightTransport.print();
        freightTransport.print();
        civilTransport.print();
        militaryTransport.print();

        System.out.println("______________________");
        boolean intHoursEntered = false;
        int hours = 0;
        while (!intHoursEntered) {
            System.out.println("Введите время движения автомобиля");
            Scanner scanner = new Scanner(System.in);
            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка ввода. Введите целое положительное число.");
            } else {
                hours = scanner.nextInt();
                if (hours < 0) {
                    System.out.println("Ошибка ввода. Введите целое положительное число.");
                } else {
                    intHoursEntered= true;
                }
            }
        }
        lightTransport.countKmWithMaxSpeed(hours);

        System.out.println("______________________");
        boolean intWeightEntered = false;
        int weight=0;
        while (!intWeightEntered) {
            System.out.println("Введите количество груза в тоннах");
            Scanner scanner = new Scanner(System.in);
            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка ввода. Введите целое положительное число.");
            } else {
                weight = scanner.nextInt();
                if (weight < 0) {
                    System.out.println("Ошибка ввода. Введите целое положительное число.");
                } else {
                    intWeightEntered = true;
                }
            }
        }
        freightTransport.checkCapacity(weight);

        System.out.println("______________________");
        boolean intPassengersEntered = false;
        int passengers = 0;
        while (!intPassengersEntered) {
            System.out.println("Введите количество пассажиров");
            Scanner scanner = new Scanner(System.in);
            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка ввода. Введите целое положительное число.");
            } else {
                passengers = scanner.nextInt();
                if (passengers < 0) {
                    System.out.println("Ошибка ввода. Введите целое положительное число.");
                } else {
                    intPassengersEntered = true;
                }
            }
        }
        civilTransport.countPassengers(passengers);

        System.out.println("______________________");
        militaryTransport.takeAShot();

        System.out.println("______________________");
        militaryTransport.checkEjectionSystem();

    }
}