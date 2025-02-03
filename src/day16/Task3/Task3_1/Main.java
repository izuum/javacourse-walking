package day16.Task3.Task3_1;

import day16.Task3.Task3_1.model.Animal;
import day16.Task3.Task3_1.model.impl.Cat;
import day16.Task3.Task3_1.model.impl.Cow;
import day16.Task3.Task3_1.model.impl.Dog;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Cat(), new Dog(), new Cow()};

        voiceAll(animals);

        voice(animals[2]);
    }

    private static void voiceAll(Animal[] animals){
        for(Animal animal: animals){
            System.out.println(animal.printVoice());
        }
    }

    private static void voice(Animal animal){
        switch (animal.getName()){
            case "Cat":
                System.out.println(animal.printVoice());
                break;
            case "Dog":
                System.out.println(animal.printVoice());
                break;
            case "Cow":
                System.out.println(animal.printVoice());
                break;
            default:
                System.out.println("Unknown animals");
        }
    }
}
