package day18.Task1_2.model;

public class Cat extends Animal {
    public static final String CAT_CLASS_NAME = "Cat";

    public Cat(){
        super(CAT_CLASS_NAME, "meow");
    }

    public void meow(){
        sound();
    }
}
