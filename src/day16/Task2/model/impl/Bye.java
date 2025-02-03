package day16.Task2.model.impl;

import day16.Task2.model.Message;

public class Bye implements Message {
    @Override
    public String printMessage() {
        return "Good Bye";
    }
}
