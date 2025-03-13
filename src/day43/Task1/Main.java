package day43.Task1;

import day30.Task2.exception.RegexValidationException;

import java.util.HashMap;
import java.util.Map;
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

        Map<String, Long> counterByWord = counterUniqueWords(wordArray);

        for(Map.Entry<String, Long> entry : counterByWord.entrySet()){
            System.out.printf("%s : %d times\n", entry.getKey(), entry.getValue());
        }
    }

    public static Map<String, Long> counterUniqueWords(String[] wordArray) {
        Map<String, Long> counterByWord = new HashMap<>();

        for(String word : wordArray){
            validateWord(word);
            long counter = counterByWord.getOrDefault(word, 0L);
            counterByWord.put(word, ++counter);
        }
        return counterByWord;
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