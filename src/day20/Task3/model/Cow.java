package day20.Task3.model;

public class Cow extends Animal {
    public static final String COW_CLASS_NAME = "Cow";
    public Cow(){
        super(COW_CLASS_NAME, "muuu");
    }
    public void muuu(){
        sound();
    }
}