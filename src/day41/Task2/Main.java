package day41.Task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words: ");
        String[] words = scanner.nextLine()
                .trim()
                .toLowerCase()
                .split(" ");
        scanner.close();
        Set<String> setWords = new HashSet<>(List.of(words));

        System.out.printf("Found %d unique words", setWords.size());
    }
}