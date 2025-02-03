package day16.Task3.Task3_2;

import day16.Task3.Task3_2.model.Animal;
import day16.Task3.Task3_2.model.Cat;
import day16.Task3.Task3_2.model.Cow;
import day16.Task3.Task3_2.model.Dog;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Cat(), new Dog(), new Cow()};

        voiceAll(animals);

    }
    private static void voiceAll(Animal[] animals){
        for(Animal animal: animals){
            animal.printVoice();
        }
    }
}
