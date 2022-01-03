package com.teachmeskills.cleaning;

import com.teachmeskills.homework7Adittional.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Cleaning {

    public static void main(String[] args) {

        SurfaceType[] surfaceTypes = SurfaceType.values();
        Cleaner Ivan = new Cleaner("Ivan", new SurfaceType[]{SurfaceType.TILE_FLOOR, SurfaceType.ENAMEL, SurfaceType.PARQUET});
        Cleaner Marina = new Cleaner("Marina", surfaceTypes);
        Cleaner Anna = new Cleaner("Anna", new SurfaceType[]{SurfaceType.GLASS_MIRROR, SurfaceType.PAINTED_WALL, SurfaceType.TABLETOP, SurfaceType.LAMINATE});
        Cleaner Sergey = new Cleaner("Sergey", new SurfaceType[]{SurfaceType.CARPET});
        Cleaner Alex = new Cleaner("Alex", new SurfaceType[]{SurfaceType.TILE_FLOOR, SurfaceType.GLASS_MIRROR, SurfaceType.TILE_WALL, SurfaceType.TABLETOP});

        Cleaner[] cleaners = {Marina,Ivan, Anna, Sergey, Alex};

        Surface tileFloor = new Surface(SurfaceType.TILE_FLOOR, 17, false, 1.5);
        Surface bath = new Surface(SurfaceType.ENAMEL, 7.5, false, 1.2);
        Surface mirror = new Surface(SurfaceType.GLASS_MIRROR, 4, false, 2);
        Surface tileWall = new Surface(SurfaceType.TILE_WALL, 22.5, false, 1);
        Surface tabletop = new Surface(SurfaceType.TABLETOP, 2.1, false, 1.1);


        System.out.printf("%.3f%n", tileFloor.calculateTimeOfSurfaceCleaning(CleaningType.DRY));

        Surface[] bathroomSurfaces = {tileFloor, bath, mirror, tileWall, tabletop};
        Room bathroom = new Room(bathroomSurfaces);

        System.out.println(bathroom);
        System.out.println("Check if room is clean: " + bathroom.checkIfRoomIsClean());
        System.out.print("Time of bathroom cleaning in minutes: ");
        System.out.printf("%.3f%n", bathroom.calculateTimeOfRoomCleaning(CleaningType.CLEAR_OUT));

        cleanRoom(bathroom, cleaners);
    }

    public static void cleanRoom(Room room, Cleaner[] cleaners) {
        Surface[] surfaces = room.surface;
        ArrayList<SurfaceType> cleaningSurfaces = new ArrayList<>();
        for (Surface surface : surfaces) {
            cleaningSurfaces.add(surface.surfaceType);
        }
        System.out.println("Cleaning surfaces are as following: " + cleaningSurfaces);
        for (Cleaner cleaner : cleaners)
            if (Arrays.asList(cleaner.surfaceTypes).containsAll(cleaningSurfaces)) {
                System.out.println("This room can be cleaned by: " + cleaner.name);
                break;
            } else {
                ArrayList<SurfaceType> cleanerSurfaces = new ArrayList<>();
                Collections.addAll(cleanerSurfaces, cleaner.surfaceTypes);
                ArrayList<SurfaceType> cleanedSurfaces;
                cleanedSurfaces = (ArrayList<SurfaceType>) (cleaningSurfaces).clone();
                if (cleaningSurfaces.removeAll(cleanerSurfaces)) {
                    do {
                        cleanedSurfaces.removeAll(cleaningSurfaces);
                        System.out.println("This room can be cleaned by: " + cleaner.name + ". Cleaned surfaces:" + cleanedSurfaces);
                        System.out.println(cleaningSurfaces.toArray().length);
                    }
                    while (cleaningSurfaces.toArray().length == 0);
                }
            }
    }
}

