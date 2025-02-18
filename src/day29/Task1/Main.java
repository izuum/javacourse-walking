package day29.Task1;

import day29.Task1.model.GenericType;

public class Main {
    public static void main(String[] args) {
        GenericType<Integer> notNullObject = new GenericType<>(1);
        System.out.println(getOrDefault(notNullObject, 2));

        GenericType<Integer> nullObject = new GenericType<>(null);
        System.out.println(getOrDefault(nullObject, 1));
    }

    private static  <T> T getOrDefault(GenericType<T> object, T defaultObject) {
        return object.getObject() != null ? object.getObject() : defaultObject;
    }
}
