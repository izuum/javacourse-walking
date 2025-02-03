package day16.Task2.model.impl;

import day16.Task2.model.Message;

public class Unknown implements Message {
    @Override
    public String printMessage(){
        return "Unknown message";
    }
}
