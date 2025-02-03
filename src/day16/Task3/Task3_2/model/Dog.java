package day16.Task3.Task3_2.model;

public class Dog extends Animal{
    private String name = "Dog";
    private String voice = "woof";

    @Override
    public void printVoice() {
        System.out.println(voice);
    }

    public String getName() {
        return name;
    }
}
