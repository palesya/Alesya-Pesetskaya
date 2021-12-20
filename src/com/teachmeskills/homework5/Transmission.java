package com.teachmeskills.homework5;

public class Transmission {
    Enum Position;

    public Transmission(Position position) {
        Position = position;
    }

    public void changePosition(Position position) {
        if (this.Position != position) {
            this.Position = position;
        }
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "Position=" + Position +
                '}';
    }
}
