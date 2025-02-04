package day18.Task1_1;

import day18.Task1_1.model.*;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Cat(), new Dog(), new Cow()};

        soundAll(animals);

    }

    private static void soundAll(Animal[] animals){
        for (Animal a: animals){
            sound(a);
        }
    }

    private static void sound(Animal animal){
        if(animal instanceof Cat cat){
            cat.meow();
        } else if(animal instanceof Dog dog){
            dog.woof();
        } else if (animal instanceof Cow cow){
            cow.muuu();
        } else {
            System.out.println("Unknown animal");
        }
    }
}
