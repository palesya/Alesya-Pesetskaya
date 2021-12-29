package com.teachmeskills.cleaning;

import java.util.Arrays;

public class Room {
    Surface[] surface;

    public Room(Surface[] surface) {
        this.surface = surface;
    }

    public boolean checkIfRoomIsClean() {
        boolean roomIsClean = true;
        for (Surface surface : surface) {
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
                "surface=" + Arrays.toString(surface) +
                '}';
    }

    public double calculateTimeOfRoomCleaning(CleaningType cleaningType) {
        double timeOfRoomCleaning = 0;
        for (Surface surface : surface) {
            if (!surface.clean) {
                timeOfRoomCleaning += surface.calculateTimeOfSurfaceCleaning(cleaningType);
            }
        }
        return timeOfRoomCleaning;
    }
}
