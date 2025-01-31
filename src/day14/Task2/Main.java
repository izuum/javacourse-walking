package day14.Task2;

import day14.Task2.model.Animal;
import day14.Task2.model.Cat;
import day14.Task2.model.Cow;
import day14.Task2.model.Dog;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Cat(), new Dog(), new Cow()};

        soundAll(animals);
    }

    private static void soundAll(Animal[] animals){
        for (Animal animal: animals){
            animal.sound();
        }
    }
}
