package com.teachmeskills.cleaning;

import java.util.Arrays;

public class Cleaner {
    private String name;
    private SurfaceType[] surfaceTypes;

    public Cleaner(String name, SurfaceType[] surfaceTypes) {
        this.name = name;
        this.surfaceTypes = surfaceTypes;
    }

    public String getName() {
        return name;
    }

    public SurfaceType[] getSurfaceTypes() {
        return surfaceTypes;
    }

    @Override
    public String toString() {
        return "Cleaner{" +
                "name='" + name + '\'' +
                ", types of cleaning surfaces=" + Arrays.toString(surfaceTypes) +
                '}';
    }
}
