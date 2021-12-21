package com.teachmeskills.homework7_1;

public abstract class Animal {
String food;
String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public abstract void makeNoise();
    public abstract void eat();
    public String sleep(Animal animal){
        return animal+" спит";
    }

}


     /*Dog, Cat, Horse переопределяют методы makeNoise, eat.
        Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных. Создайте класс Ветеринар, в котором определите метод
        void treatAnimal(Animal animal). Пусть этот метод распечатывает food и location пришедшего на прием животного. В методе main создайте массив
        типа Animal, в который запишите животных всех имеющихся у вас типов. В цикле отправляйте их на прием к ветеринару.*/