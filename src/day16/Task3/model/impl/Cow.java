package day16.Task3.model.impl;

import day16.Task3.model.Animal;

public class Cow implements Animal {
    private String name = "Cow";
    private String voice = "moooo";
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String printVoice() {
        return voice;
    }
}
