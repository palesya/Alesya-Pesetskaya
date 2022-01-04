package com.teachmeskills.cleaning;

import java.util.Arrays;

public class Room {
    Surface[] surfaces;

    public Room(Surface[] surfaces) {
        this.surfaces = surfaces;
    }

    public boolean checkIfRoomIsClean() {
        boolean roomIsClean = true;
        for (Surface surface : surfaces) {
            if (!surface.clean) {
                roomIsClean = false;
                break;
            }
        }
        return roomIsClean;
    }

    @Override
    public String toString() {
        return "Room{" +
                "surfaces=" + Arrays.toString(surfaces) +
                '}';
    }

    public double calculateTimeOfRoomCleaning(CleaningType cleaningType) {
        double timeOfRoomCleaning = 0;
        for (Surface surface : surfaces) {
            if (!surface.clean) {
                timeOfRoomCleaning += surface.calculateTimeOfSurfaceCleaning(cleaningType);
            }
        }
        return timeOfRoomCleaning;
    }
}
