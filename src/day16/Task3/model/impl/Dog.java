package day16.Task3.model.impl;

import day16.Task3.model.Animal;

public class Dog implements Animal {
    private String name = "Dog";
    private String voice = "woof";
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String printVoice() {
        return voice;
    }
}
