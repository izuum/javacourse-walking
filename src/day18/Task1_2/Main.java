package day18.Task1_2;

import day18.Task1_2.model.*;

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
        if(animal.getClass().equals(Cat.class)){
            ((Cat) animal).meow();
        } else if(animal.getClass().equals(Dog.class)){
            ((Dog) animal).woof();
        } else if (animal.getClass().equals(Cow.class)){
            ((Cow) animal).muuu();
        } else {
            System.out.println("Unknown animal");
        }
    }
}
