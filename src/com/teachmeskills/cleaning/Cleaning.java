package com.teachmeskills.cleaning;

import java.util.Arrays;

public class Cleaning {


    public static void main(String[] args) {

        SurfaceType[] surfaceTypes = SurfaceType.values();
        Cleaner Ivan = new Cleaner("Ivan", new SurfaceType[]{SurfaceType.TILE_FLOOR, SurfaceType.ENAMEL,SurfaceType.PARQUET});
        Cleaner Marina = new Cleaner("Marina", surfaceTypes);
        Cleaner Anna = new Cleaner("Anna",new SurfaceType[]{SurfaceType.GLASS_MIRROR, SurfaceType.PAINTED_WALL,SurfaceType.TABLETOP,SurfaceType.LAMINATE} );
        Cleaner Sergey = new Cleaner("Sergey",new SurfaceType[]{SurfaceType.CARPET} );

        Surface tileFloor = new Surface(SurfaceType.TILE_FLOOR, 17, false, 1.5);
        Surface bath = new Surface(SurfaceType.ENAMEL, 7.5, false, 1.2);
        Surface mirror = new Surface(SurfaceType.GLASS_MIRROR, 4, false, 2);


        System.out.printf("%.3f%n", tileFloor.calculateTimeOfSurfaceCleaning(CleaningType.DRY));

        Room bathroom = new Room(new Surface[]{tileFloor, bath,mirror});

        System.out.println(bathroom);
        System.out.println(bathroom.checkIfRoomIsClean());
        System.out.printf("%.3f%n", bathroom.calculateTimeOfRoomCleaning(CleaningType.CLEAR_OUT));

    }

    public void cleanRoom (Room room){

    }
}
