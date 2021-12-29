package com.teachmeskills.cleaning;

import java.util.Arrays;

public class Cleaner {
    String name;
    SurfaceType[] surfaceTypes;

    public Cleaner(String name, SurfaceType[] surfaceTypes) {
        this.name = name;
        this.surfaceTypes = surfaceTypes;
    }

    @Override
    public String toString() {
        return "Cleaner{" +
                "name='" + name + '\'' +
                ", types of cleaning surfaces=" + Arrays.toString(surfaceTypes) +
                '}';
    }
}
