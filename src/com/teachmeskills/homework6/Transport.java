package com.teachmeskills.homework6;

public abstract class Transport {

    private int capacityHorsepower;
    private int maxSpeedKmPerHour;
    private int weightKilos;
    private String brand;

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


    @Override
    public String toString() {
        return "Brand: " + brand +
                "; Capacity in horsepower: " + capacityHorsepower +
                "; Maximum speed in Km/Hour: " + maxSpeedKmPerHour +
                "; Weight in kilos: " + weightKilos;
    }

    public int getCapacityHorsepower() {
        return capacityHorsepower;
    }

    public int getMaxSpeedKmPerHour() {
        return maxSpeedKmPerHour;
    }

    public int getWeightKilos() {
        return weightKilos;
    }

    public String getBrand() {
        return brand;
    }
}



