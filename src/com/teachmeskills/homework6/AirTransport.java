package com.teachmeskills.homework6;

public abstract class AirTransport extends Transport {
    double wingspanMetres;
    int minRunwayLengthMetres;

    public AirTransport(int capacityHorsepower, int maxSpeedKmPerHour, int weight, String brand, double wingspanMetres, int minRunwayLengthMetres) {
        super(capacityHorsepower, maxSpeedKmPerHour, weight, brand);
        this.wingspanMetres = wingspanMetres;
        this.minRunwayLengthMetres = minRunwayLengthMetres;
    }

}

