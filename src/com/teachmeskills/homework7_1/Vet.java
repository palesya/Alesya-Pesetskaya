package com.teachmeskills.homework7_1;

public class Vet {
     public void treatAnimal(Animal animal){
        System.out.println("Животное " + animal+" ест "+animal.getFood()+",место проживания "+animal.getLocation());
    }
}
