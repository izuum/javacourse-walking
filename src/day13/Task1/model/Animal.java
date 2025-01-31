package day13.Task1.model;

public class Animal {
    private final String className;
    private final String sound;
    protected Animal(String className, String sound){
        this.className = className;
        this.sound = sound;

    }
    protected void sound(){
        System.out.println(sound);
    }

    public String getClassName(){
        return className;
    }

}
