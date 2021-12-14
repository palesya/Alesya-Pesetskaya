package com.teachmeskills.homework5;

import static com.teachmeskills.homework5.Position.Neutral;
import static com.teachmeskills.homework5.Position.Parking;

public class Transmission {
    Enum Position;

    public void changePosition(Enum Position) {
        this.Position = Position;
    }

    public Transmission(Enum position) {
        Position = position;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "Position=" + Position +
                '}';
    }
}
