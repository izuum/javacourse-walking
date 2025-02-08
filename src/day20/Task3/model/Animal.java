package day20.Task3.model;

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
}