package com.teachmeskills.cleaning;

public enum SurfaceType {
    TILE_FLOOR(10 / 60f),//плитка
    TILE_WALL(12 / 60f),
    LAMINATE(6 / 60f),
    PARQUET(8 / 60f),
    TABLETOP(20 / 60f),
    PAINTED_WALL(14 / 60f),
    ENAMEL(40 / 60f),
    GLASS_MIRROR(2),
    CARPET(2);

    private double timeOfCleaningSquareMetreMinutes;

    SurfaceType(double timeOfCleaningSquareMetreMinutes) {
        this.timeOfCleaningSquareMetreMinutes = timeOfCleaningSquareMetreMinutes;
    }

    public double getTimeOfCleaningSquareMetreMinutes() {
        return timeOfCleaningSquareMetreMinutes;
    }
}
