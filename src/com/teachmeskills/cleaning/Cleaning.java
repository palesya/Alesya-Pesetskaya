package com.teachmeskills.cleaning;

import java.util.*;

public class Cleaning {

    public static void main(String[] args) {

        Cleaner Ivan = new Cleaner("Ivan", new SurfaceType[]{SurfaceType.TILE_FLOOR, SurfaceType.ENAMEL, SurfaceType.PARQUET});
        //Cleaner Marina = new Cleaner("Marina", surfaceTypes);
        Cleaner Anna = new Cleaner("Anna", new SurfaceType[]{SurfaceType.GLASS_MIRROR, SurfaceType.PAINTED_WALL, SurfaceType.TABLETOP, SurfaceType.LAMINATE});
        Cleaner Sergey = new Cleaner("Sergey", new SurfaceType[]{SurfaceType.CARPET});
        Cleaner Alex = new Cleaner("Alex", new SurfaceType[]{SurfaceType.TILE_FLOOR, SurfaceType.GLASS_MIRROR, SurfaceType.TILE_WALL, SurfaceType.TABLETOP});

        Cleaner[] cleaners = {Ivan, Anna, Sergey, Alex};

        Surface tileFloor = new Surface(SurfaceType.TILE_FLOOR, 17, false);
        Surface bath = new Surface(SurfaceType.ENAMEL, 7.5, false);
        Surface mirror = new Surface(SurfaceType.GLASS_MIRROR, 4, false);
        Surface tileWall = new Surface(SurfaceType.TILE_WALL, 22.5, false);
        Surface tabletop = new Surface(SurfaceType.TABLETOP, 2.1, false);

        Surface[] bathroomSurfaces = {tileFloor, bath, mirror, tileWall, tabletop};
        Room bathroom = new Room(bathroomSurfaces);

        if (!bathroom.checkIfRoomIsClean()) {
            System.out.print("Time of bathroom cleaning in minutes: ");
            System.out.printf("%.3f%n", bathroom.calculateTimeOfRoomCleaning(CleaningType.CLEAR_OUT));
            cleanRoom(bathroom, cleaners);

        } else {
            System.out.print("This room is already clean.");
        }
    }

    public static void cleanRoom(Room room, Cleaner[] cleaners) {
        Surface[] surfaces = room.surfaces;

        //поверхности, которые нужно убрать
        ArrayList<SurfaceType> cleaningSurfaces = new ArrayList<>();
        List<String> bathroomCleaningTools = new ArrayList<>();
        for (Surface surface : surfaces) {
            if (!surface.clean) {
                cleaningSurfaces.add(surface.surfaceType);
                bathroomCleaningTools.add(Arrays.toString(CleaningTools.chooseCleaningTools(CleaningType.CLEAR_OUT, surface.surfaceType)));
            }
        }
        System.out.println("Cleaning surfaces are as following: " + cleaningSurfaces);
        System.out.println("Cleaning tools are as following:" + Arrays.toString(bathroomCleaningTools.toArray()));
        while (cleaningSurfaces.toArray().length != 0) {
            //находим уборщика, который лучше подходит для уборки
            List<Cleaner> listOfCleaners = new LinkedList<>(Arrays.asList(cleaners));
            Cleaner bestMatchCleaner = findCleanerWithMaxMatch(listOfCleaners, cleaningSurfaces);

            //убранная поверхность
            ArrayList<SurfaceType> cleanedSurfaces= new ArrayList<>(cleaningSurfaces);
            cleanedSurfaces.retainAll(List.of(bestMatchCleaner.surfaceTypes));

            //поверхность, которую осталось убрать
            cleaningSurfaces.removeAll(List.of(bestMatchCleaner.surfaceTypes));

            System.out.println("This room can be cleaned by: " + bestMatchCleaner.name + ". Cleaned surfaces:" + cleanedSurfaces);

            //убираем лучшего уборщика из списка, чтобы найти следующего
            listOfCleaners.remove(bestMatchCleaner);
        }
    }

    public static Cleaner findCleanerWithMaxMatch
            (List<Cleaner> listOfCleaners, ArrayList<SurfaceType> cleaningSurfaces) {
        Cleaner bestMatchCleaner = listOfCleaners.get(0);
        int matches;
        int maxMatches = 0;
        for (Cleaner cleaner : listOfCleaners) {
            matches = calculateSurfaceMatches(cleaner.surfaceTypes, cleaningSurfaces);
            if (matches > maxMatches) {
                maxMatches = matches;
                bestMatchCleaner = cleaner;
            }
        }
        return bestMatchCleaner;
    }

    public static int calculateSurfaceMatches(SurfaceType[] cleanerSurfaces, ArrayList<SurfaceType> cleaningSurfaces) {
        int matches = 0;
        for (int i = 0; i < cleaningSurfaces.toArray().length; i++) {
            for (SurfaceType cleanerSurface : cleanerSurfaces) {
                if (Objects.equals(cleanerSurface, cleaningSurfaces.get(i))) {
                    matches++;
                }
            }
        }
        return matches;
    }
}


