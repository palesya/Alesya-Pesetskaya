package com.teachmeskills.cleaning;

public enum CleaningType {
    //сухая уборка - смахиваем пыль щеточкой, пылесосим, убираем паутину из углов, подметаем, собираем мусор руками.
    DRY(0.8),
    //влажная - протирание пыли, мытьё пола
    WET(1),
    //вытереть стены, постирать и погладить шторы, мытьё ванной, раковин, плиты
    CLEAR_OUT(1.5);
    double coefficientOfCleaningType;

    CleaningType(double coefficientOfCleaningType) {
        this.coefficientOfCleaningType = coefficientOfCleaningType;
    }

    public double getCoefficientOfCleaningType() {
        return coefficientOfCleaningType;
    }
}
