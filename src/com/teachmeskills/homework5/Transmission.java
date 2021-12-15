package com.teachmeskills.homework5;

public class Transmission {
    Enum Position;

    public Transmission(Enum position) {
        Position = position;
    }

    public void changePosition(Enum position) {
        if (this.Position != position){
            this.Position=position;
        }else {
            System.out.println("Car is already in selected Position "+ this.Position);
        }
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "Position=" + Position +
                '}';
    }
}
