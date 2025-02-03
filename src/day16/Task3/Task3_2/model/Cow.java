package day16.Task3.Task3_2.model;

public class Cow extends Animal{
    private final String name = "Cow";
    private final String voice = "moooo";


    @Override
    public void printVoice() {
        System.out.println(voice);
    }

    public String getName() {
        return name;
    }
}
