package com.teachmeskills.homework5;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Car {
    private Engine engines;
    private Transmission transmissions;
    public int rudderAngle;
    Enum Drive;
    private Headlights headlights;

    public Car(Engine engines, Transmission transmissions, int rudderAngle, Enum drive, Headlights headlights) {
        this.engines = engines;
        this.transmissions = transmissions;
        this.rudderAngle = rudderAngle;
        this.headlights = headlights;
    }

    public static void pushGasPedal() {
        Engine.increaseEngineSpeed();
    }

    public static void pushBreakPedal() {
        Engine.decreaseEngineSpeed();
    }

    //повернуть колесо
    public void turnSteeringWheel() {
        int a = this.rudderAngle;
        int newAngle = 0;
        int minAngle = -30 - a;
        int maxAngle = 30 - a;
        System.out.println("Steering Wheel can be turned from " + minAngle + " to " + maxAngle + " degree");
        Scanner scanner = new Scanner(System.in);
        boolean rightAngle = false;
        while (!rightAngle) {
            System.out.println("Enter Steering Wheel degree: ");
            newAngle = scanner.nextInt();
            if (newAngle < minAngle || newAngle > maxAngle) {
                System.out.println("Please enter Steering Wheel from allowed range.");
                System.out.println("Steering Wheel can be turned from " + minAngle + " to " + maxAngle + " degree");
            } else rightAngle = true;
        }
        this.rudderAngle = this.rudderAngle + newAngle;
    }

    public void turnCarHeadlightsOn() {
        this.headlights.turnHeadlightsOn();
    }


    //переключить передачу
    public void changePosition() {
        boolean positionExists = false;
        boolean positionSelected = false;
        String printedPosition = "";
        while (!positionExists && !positionSelected) {
            System.out.println("Enter new allowed position (Parking,Drive,Neutral,Reverse) except current position: " + this.transmissions.Position);
            Scanner scanner = new Scanner(System.in);
            printedPosition = scanner.next();
            for (Position el : Position.values()) {
                if (el.name().equalsIgnoreCase(printedPosition) && el != this.transmissions.Position) {
                    positionExists = true;
                    positionSelected = true;
                    break;
                }
                if (el.name().equalsIgnoreCase(printedPosition) && el == this.transmissions.Position) {
                    System.out.println("Car is already in selected Position " + this.transmissions.Position);
                    positionExists = true;
                    break;
                }
            }
            if (!positionExists) {
                System.out.println("You've entered not existing position");
            }
        }
        Enum newPosition = Position.valueOf(printedPosition);
        this.transmissions.changePosition(newPosition);
    }

    @Override
    public String toString() {
        return "Car{" +
                "engines=" + engines +
                ", transmissions=" + transmissions +
                ", rudderAngle=" + rudderAngle +
                ", Drive=" + Drive +
                ", headlights=" + headlights +
                '}';
    }
}



