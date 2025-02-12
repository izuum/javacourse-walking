package day25.Task2.Task2_1;


public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{createCat(), createDog(), createCow()};

        soundAll(animals);
    }

    private static void soundAll(Animal[] animals){
        for (Animal animal: animals){
            animal.sound();
        }
    }

    private static Animal createCat(){
        return new Animal() {
            @Override
            public void sound() {
                System.out.println("meow");
            }
        };
    }

    private static Animal createDog(){
        return new Animal() {
            @Override
            public void sound() {
                System.out.println("woof");
            }
        };
    }

    private static Animal createCow(){
        return new Animal() {
            @Override
            public void sound() {
                System.out.println("moooo");
            }
        };
    }
}
