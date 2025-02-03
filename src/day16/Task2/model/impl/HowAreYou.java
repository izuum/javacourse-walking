package day16.Task2.model.impl;

import day16.Task2.model.Message;

public class HowAreYou implements Message {
    @Override
    public String printMessage() {
        return "How are your doing";
    }
}
