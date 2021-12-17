package com.teachmeskills.homework6;

public class Main {
    public static void main(String[] args) throws Exception {

        LightTransport lightTransport = new LightTransport(200, 180, 1600, "Renault", 4, 10, "Hatchback", 5);
        FreightTransport freightTransport = new FreightTransport(300, 140, 6000, "MAZ", 6, 20, 10);
        CivilTransport civilTransport = new CivilTransport(50000, 1300, 430000, "Airbus", 79, 2300, 568, true);
        MilitaryTransport militaryTransport = new MilitaryTransport(90000, 850, 250000, "AN", 88.4, 500, true, 20);

        lightTransport.print();
        freightTransport.print();
        civilTransport.print();
        militaryTransport.print();

        System.out.println("______________________");
        lightTransport.countKmWithMaxSpeed();

        System.out.println("______________________");
        freightTransport.checkCapacity();

        System.out.println("______________________");
        civilTransport.countPassengers();

        System.out.println("______________________");
        militaryTransport.takeAShot();

        System.out.println("______________________");
        militaryTransport.checkEjectionSystem();

    }
}