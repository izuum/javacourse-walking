package day16.Task3.model.impl;

import day16.Task3.model.Animal;

public class Cat implements Animal {
    private String name = "Cat";
    private String voice = "meow";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String printVoice() {
        return voice;
    }
}
