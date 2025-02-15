package day26.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words: ");
        String[] words = scanner.nextLine()
                .trim()
                .toLowerCase()
                .split(" ");
        scanner.close();

        System.out.printf("Found %d unique words", counterUniqueWords(words));
    }

    public static int counterUniqueWords(String[] words) {
        int counter = 0;

        for (int i = 0; i < words.length; i++) {
            int j = 0;
            boolean isUnique = true;

            while (j < i && isUnique){
                if(words[i].equals(words[j])) {
                    isUnique = false;
                } else {
                    j++;
                }
            }
            if (isUnique){
                counter++;
            }
        }
        return counter;
    }
}