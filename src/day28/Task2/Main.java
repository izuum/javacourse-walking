package day28.Task2;

import day28.Task2.model.NotNullObject;

public class Main {
    public static void main(String[] args) {
        NotNullObject<Object> notNullObject = new NotNullObject<>(new Object());
        System.out.println(notNullObject.isNull());

        NotNullObject<Object> nullObject = new NotNullObject<>(null);
        System.out.println(nullObject.isNull());
    }
}
