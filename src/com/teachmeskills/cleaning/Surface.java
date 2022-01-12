package com.teachmeskills.cleaning;

public class Surface implements CleaningMethods {
    private SurfaceType surfaceType;
    private double surfaceArea;
    private boolean clean;

    public Surface(SurfaceType surfaceType, double surfaceArea, boolean clean) {
        this.surfaceType = surfaceType;
        this.surfaceArea = surfaceArea;
        this.clean = clean;
    }

    @Override
    public double calculateTimeOfSurfaceCleaning(CleaningType cleaningType) {
        double timeOfSurfaceCleaning;
        if (this.clean) {
            timeOfSurfaceCleaning = 0;
            System.out.println("Surface is already clean");
        } else {
            timeOfSurfaceCleaning = surfaceType.getTimeOfCleaningSquareMetreMinutes() * cleaningType.getCoefficientOfCleaningType() * surfaceArea;
        }
        return timeOfSurfaceCleaning;
    }

    public boolean isClean() {
        return clean;
    }

    public SurfaceType getSurfaceType() {
        return surfaceType;
    }

    @Override
    public String toString() {
        return "Surface{" +
                "surfaceType=" + surfaceType +
                ", surfaceArea=" + surfaceArea +
                ", clean=" + clean +
                '}';
    }
}
