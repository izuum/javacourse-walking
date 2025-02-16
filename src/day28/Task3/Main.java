package day28.Task3;

import day28.Task3.model.NumberSearch;


public class Main {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 6, 7};
        NumberSearch<Integer> integerNumberSearch = new NumberSearch<>(integers);

        System.out.println(integerNumberSearch.findValue(1));

        integerNumberSearch.findValue(8);
    }
}
