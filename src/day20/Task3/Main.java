package day20.Task3;

import day20.Task3.exception.*;
import day20.Task3.model.*;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Cat(), new Dog(), new Cow()};

        soundAll(animals);
    }

    private static void soundAll(Animal[] animals){
        for (int i = 0; i < animals.length; i++){
            if(animals[i] == null){
                throw new ArrayValidationException(i);
            }
            sound(animals[i]);
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
            throw new UnknownAnimalException("Unknown animal");
        }
    }
}