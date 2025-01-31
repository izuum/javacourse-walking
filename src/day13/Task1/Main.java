package day13.Task1;

import day13.Task1.model.Animal;
import day13.Task1.model.Cat;
import day13.Task1.model.Cow;
import day13.Task1.model.Dog;

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
        switch (animal.getClassName()){
            case Cat.CAT_CLASS_NAME:
                ((Cat)animal).meow();
                break;
            case Dog.DOG_CLASS_NAME:
                ((Dog)animal).woof();
                break;
            case Cow.COW_CLASS_NAME:
                ((Cow)animal).muuu();
                break;
            default:
                System.out.println("unknown animal!");
        }
    }
}
