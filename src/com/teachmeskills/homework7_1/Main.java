package com.teachmeskills.homework7_1;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("рыба", "квартира", true, "длинношерстная", "британская");
        Animal dog = new Dog("мясо", "конура", false, 0);
        Animal horse = new Horse("овёс", "стойло", true, "ездовая");
        Vet vet = new Vet();

        //демонстрация методов makeNoise,eat
        Animal[] animals = {cat, dog, horse};
        for (Animal animal : animals) {
            animal.makeNoise();
            animal.eat();
        }

        System.out.println("_______________________");
        //все животные отправлены к ветеринару

        for (Animal animal : animals) {
            System.out.println("Животное " + animal + " отправлено на приём к ветеринару");
            vet.treatAnimal(animal);
            System.out.println("");
        }
    }
}
