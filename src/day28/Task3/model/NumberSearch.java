package day28.Task3.model;

import day28.Task3.exception.ElementNotFoundException;

import java.util.Objects;

public class NumberSearch<T> {
    private final T[] arrayOfValues;

    public NumberSearch(T[] arrayOfValues) {
        this.arrayOfValues = arrayOfValues;
    }

    public T findValue(T searchingValue) {
        for (T element : arrayOfValues) {
            if (Objects.equals(element, searchingValue)) {
                return element;
            }
        }

        throw new ElementNotFoundException();
    }
}
