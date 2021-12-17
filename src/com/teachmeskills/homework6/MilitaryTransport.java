package com.teachmeskills.homework6;

import java.util.Scanner;

public class MilitaryTransport extends AirTransport {
    boolean ejectionSystem;
    int missilesOnBoard;

    public MilitaryTransport(int capacityHorsepower, int maxSpeedKmPerHour, int weight, String brand, double wingspanMetres, int minRunwayLengthMetres, boolean ejectionSystem, int missilesOnBoard) {
        super(capacityHorsepower, maxSpeedKmPerHour, weight, brand, wingspanMetres, minRunwayLengthMetres);
        this.ejectionSystem = ejectionSystem;
        this.missilesOnBoard = missilesOnBoard;
    }

    @Override
    public String toString() {
        return "Brand: " + brand +
                "; Capacity in horsepower: " + capacityHorsepower +
                "; Maximum speed in Km/Hour: " + maxSpeedKmPerHour +
                "; Weight in kilos: " + weightKilos +
                "; Wingspan in metres: " + wingspanMetres +
                "; Minimum runway length in metres: " + minRunwayLengthMetres+
                "; Is ejection system allowed: " + ejectionSystem +
                "; Number of missiles on board: " + missilesOnBoard;
    }

    public void print() {
        System.out.print(this);
        countCapacityKilowatts();
        System.out.println();
    }

    public void takeAShot() {
        if (missilesOnBoard > 0) {
            System.out.println("Ракета пошла...");
            this.missilesOnBoard -= 1;
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void checkEjectionSystem() {
        if (ejectionSystem) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }

}