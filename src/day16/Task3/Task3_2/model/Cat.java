package day16.Task3.Task3_2.model;

public class Cat extends Animal{
    private String name = "Cat";
    private String voice = "meow";


    @Override
    public void printVoice() {
        System.out.println(voice);
    }

    public String getName() {
        return name;
    }
}
