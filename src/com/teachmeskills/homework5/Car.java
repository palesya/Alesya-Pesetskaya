package com.teachmeskills.homework5;

public class Car {
    private Engine engines;
    private Transmission transmissions;
    public int rudderAngle;
    Enum Wheel;
    private Headlights headlights;

    public Car(Engine engines, Transmission transmissions, int rudderAngle, Wheel wheel, Headlights headlights) {
        this.engines = engines;
        this.transmissions = transmissions;
        this.rudderAngle = rudderAngle;
        this.Wheel = wheel;
        this.headlights = headlights;
    }

    public void pushGasPedal() {
engines.increaseEngineSpeed();
    }

    public void pushBreakPedal() {
        engines.decreaseEngineSpeed();
    }

    //повернуть колесо
    public boolean turnSteeringWheel(int newAngle) {
        int a = this.rudderAngle;
        int minAngle = -30 - a;
        int maxAngle = 30 - a;
        boolean isTurned = false;
        if (newAngle >= minAngle && newAngle <= maxAngle) {
            this.rudderAngle = this.rudderAngle + newAngle;
            isTurned = true;
        } else {
            System.out.println("Steering Wheel can't be turned on " + newAngle + " angle.");
            System.out.println("Steering Wheel can be turned from " + minAngle + " to " + maxAngle + " degree");
        }
        return isTurned;
    }

    public void turnCarHeadlightsOn() {
        this.headlights.turnHeadlightsOn();
    }


    //переключить передачу
    public boolean changePosition(Position newPosition) {
        boolean isChanged = false;
        for (Position el : Position.values()) {
            if (el.name().equalsIgnoreCase(String.valueOf(newPosition)) && el == this.transmissions.Position) {
                System.out.println("Car is already in selected Position " + this.transmissions.Position);
                break;
            }
            if (el.name().equalsIgnoreCase(String.valueOf(newPosition)) && el != this.transmissions.Position) {
                this.transmissions.changePosition(newPosition);
                isChanged = true;
                break;
            }
        }
        return isChanged;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engines=" + engines +
                ", transmissions=" + transmissions +
                ", rudderAngle=" + rudderAngle +
                ", Wheel=" + Wheel +
                ", headlights=" + headlights +
                '}';
    }
}



