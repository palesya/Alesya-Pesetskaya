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
            System.out.print("Cleaning tools for room are:"+collectCleaningToolsForRoom(bathroom));
        } else {
            System.out.print("This room is already clean.");
        }
    }

    public static void cleanRoom(Room room, Cleaner[] cleaners) {
        Surface[] surfaces = room.getSurfaces();

        //поверхности, которые нужно убрать
        ArrayList<SurfaceType> cleaningSurfaces = new ArrayList<>();
        for (Surface surface : surfaces) {
            if (!surface.isClean()) {
                cleaningSurfaces.add(surface.getSurfaceType());
            }
        }
        System.out.println("Cleaning surfaces are as following: " + cleaningSurfaces);
        while (cleaningSurfaces.toArray().length != 0) {
            //находим уборщика, который лучше подходит для уборки
            List<Cleaner> listOfCleaners = new LinkedList<>(Arrays.asList(cleaners));
            Cleaner bestMatchCleaner = findCleanerWithMaxMatch(listOfCleaners, cleaningSurfaces);

            //убранная поверхность
            ArrayList<SurfaceType> cleanedSurfaces = new ArrayList<>(cleaningSurfaces);
            cleanedSurfaces.retainAll(List.of(bestMatchCleaner.getSurfaceTypes()));

            //поверхность, которую осталось убрать
            cleaningSurfaces.removeAll(List.of(bestMatchCleaner.getSurfaceTypes()));

            System.out.println("This room can be cleaned by: " + bestMatchCleaner.getName() + ". Cleaned surfaces:" + cleanedSurfaces);

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
            matches = calculateSurfaceMatches(cleaner.getSurfaceTypes(), cleaningSurfaces);
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

    public static List<String> collectCleaningToolsForRoom(Room room) {
        Surface[] surfaces = room.getSurfaces();
        List<String> cleaningToolsForRoom=new ArrayList<>();
        List<String> cleaningToolsForSurface;
        for (Surface surface : surfaces) {
            if (!surface.isClean()) {
                cleaningToolsForSurface = CleaningTools.chooseCleaningTools(CleaningType.CLEAR_OUT, surface.getSurfaceType());
                for (int i = 0; i < cleaningToolsForSurface.toArray().length; i++) {
                    if(!cleaningToolsForRoom.contains(cleaningToolsForSurface.get(i)))
                    cleaningToolsForRoom.add(cleaningToolsForSurface.get(i));
                }
            }
        }
        return cleaningToolsForRoom;
    }
}
