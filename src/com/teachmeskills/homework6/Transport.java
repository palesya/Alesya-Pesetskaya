package com.teachmeskills.homework6;

public abstract class Transport {

    int capacityHorsepower;
    int maxSpeedKmPerHour;
    int weightKilos;
    String brand;

    public Transport(int capacityHorsepower, int maxSpeedKmPerHour, int weight, String brand) {
        this.capacityHorsepower = capacityHorsepower;
        this.maxSpeedKmPerHour = maxSpeedKmPerHour;
        this.weightKilos = weight;
        this.brand = brand;
    }


    public void countCapacityKilowatts() {
        double capacityKilowatts = this.capacityHorsepower * 0.74;
        System.out.print("; Capacity in kilowatts: " +capacityKilowatts);
    }

}



