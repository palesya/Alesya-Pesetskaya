package com.teachmeskills.cleaning;

public class Surface implements CleaningMethods {
    SurfaceType surfaceType;
    double surfaceArea;
    boolean clean;
    double coefficientOfDirt;

    public Surface(SurfaceType surfaceType, double surfaceArea, boolean clean, double coefficientOfDirt) {
        this.surfaceType = surfaceType;
        this.surfaceArea = surfaceArea;
        this.clean = clean;
        this.coefficientOfDirt = coefficientOfDirt;
    }

    @Override
    public double calculateTimeOfSurfaceCleaning(CleaningType cleaningType) {
        double timeOfSurfaceCleaning;
        double coefficientOfCleaningType=0;
        double timeOfCleaningSquareMetreMinutes = 0;
        if (this.clean) {
            timeOfSurfaceCleaning=0;
            System.out.println("Surface is already clean");
        } else {
            switch (cleaningType) {
                case DRY:
                    coefficientOfCleaningType = 0.8;
                    break;
                case WET:
                    coefficientOfCleaningType = 1;
                    break;
                case CLEAR_OUT:
                    coefficientOfCleaningType = 1.5;
                    break;
            }
            switch (this.surfaceType) {
                case TILE_FLOOR:
                    timeOfCleaningSquareMetreMinutes = 10 / 60f;
                    break;
                case ENAMEL:
                    timeOfCleaningSquareMetreMinutes = 40 / 60f;
                    break;
                case GLASS_MIRROR:
                    timeOfCleaningSquareMetreMinutes = 2;
                    break;
                case LAMINATE:
                    timeOfCleaningSquareMetreMinutes = 6 / 60f;
                    break;
                case PAINTED_WALL:
                    timeOfCleaningSquareMetreMinutes = 14 / 60f;
                    break;
                case PARQUET:
                    timeOfCleaningSquareMetreMinutes = 8 / 60f;
                    break;
                case TABLETOP:
                    timeOfCleaningSquareMetreMinutes = 20 / 60f;
                    break;
                case TILE_WALL:
                    timeOfCleaningSquareMetreMinutes = 12 / 60f;
                    break;
                case CARPET:
                    timeOfCleaningSquareMetreMinutes = 2;
                    break;
            }
            timeOfSurfaceCleaning = timeOfCleaningSquareMetreMinutes*coefficientOfCleaningType*surfaceArea*coefficientOfDirt;
        }
        return timeOfSurfaceCleaning;
    }

    @Override
    public String toString() {
        return "Surface{" +
                "surfaceType=" + surfaceType +
                ", surfaceArea=" + surfaceArea +
                ", clean=" + clean +
                ", coefficientOfDirt=" + coefficientOfDirt +
                '}';
    }
}

