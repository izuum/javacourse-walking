package day30.Task3;

import day30.Task2.exception.RegexValidationException;

import java.util.Scanner;

public class Main {
    public static final String WORDS_REGEX = "[a-z-\\s]+";
    public static final String COMPLEX_WORD_REGEX = "[a-z][a-z-]+[a-z]";
    public static final String WORD_REGEX = "[a-z]+";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words: ");
        String words = scanner.nextLine()
                .trim()
                .toLowerCase();
        scanner.close();

        if (!words.matches(WORDS_REGEX)) {
            throw new RegexValidationException(words, WORDS_REGEX);
        }

        String[] wordArray = words.split("\\s+");

        int counter = counterUniqueWords(wordArray);

        System.out.printf("Found %d unique words\n", counter);
    }

    public static int counterUniqueWords(String[] wordArray) {
        int counter = 0;

        for (int i = 0; i < wordArray.length; i++) {
            validateWord(wordArray[i]);

            boolean isUnique = isUniqueWord(wordArray, i);

            if (isUnique) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean isUniqueWord(String[] wordArray, int currentWordIndex) {
        int j = 0;

        while (j < currentWordIndex) {
            if (wordArray[currentWordIndex].equals(wordArray[j])) {
                return false;
            }
            j++;
        }
        return true;
    }

    public static void validateWord(String word){
        if(word.contains("-")){
            if(!word.matches(COMPLEX_WORD_REGEX)){
                throw new RegexValidationException(word, COMPLEX_WORD_REGEX);
            }

            for (String wordPart : word.split("-")){
                validateSimpleWord(wordPart);
            }
        }else {
            validateSimpleWord(word);
        }
    }

    public static void validateSimpleWord(String word){
        if(!word.matches(WORD_REGEX)){
            throw new RegexValidationException(word, WORD_REGEX);
        }
    }
}