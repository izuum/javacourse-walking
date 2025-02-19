package day30.Task2;

import day30.Task2.exception.RegexValidationException;
import day30.Task2.model.FullName;

import java.util.Scanner;

public class Main {
    public static final String FULL_NAME_REGEX = "^[А-Я][А-Яа-я]* [А-Я][а-я]* [А-Я][а-я]+$";
    public static final String DOUBLE_SURNAME_REGEX = "[А-Я][а-я]*-[А-Я][а-я]*";
    public static final String NAME_REGEX = "[А-Я][а-я]*";
    public static final String PATRONYMIC_REGEX = "[А-Я][а-я]+";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(parseName(scanner.nextLine()));

//        isValidName(scanner.nextLine());
    }

    private static FullName parseName(String nameString) {
        if (!nameString.matches(FULL_NAME_REGEX)) {
            throw new RegexValidationException(nameString, FULL_NAME_REGEX);
        }

        FullName fullName = new FullName();
        String[] splitNameString = nameString.split(" ");

        String surname = splitNameString[0];
        validateSurname(surname);
        fullName.setSurname(surname);

        String name = splitNameString[1];
        validateName(name);
        fullName.setName(name);

        String patronymic = splitNameString[2];
        validatePatronymic(patronymic);
        fullName.setLastname(patronymic);

        return fullName;
    }

    private static void validateSurname(String surname) {
        if (surname.contains("-")) {
            if (!surname.matches(DOUBLE_SURNAME_REGEX)) {
                throw new RegexValidationException(surname, DOUBLE_SURNAME_REGEX);
            }
        } else {
            validateName(surname);
        }
    }

    private static void validateName(String name) {
        if (!name.matches(NAME_REGEX)) {
            throw new RegexValidationException(name, NAME_REGEX);
        }
    }

    private static void validatePatronymic(String patronymic) {
        if (!patronymic.matches(PATRONYMIC_REGEX)) {
            throw new RegexValidationException(patronymic, PATRONYMIC_REGEX);
        }
    }


//    private static void isValidName(String name){
//        if(!name.matches("((^[А-Я][а-я]*)|(^[А-Я][а-я]*-[А-Я][а-я]*))\s[А-Я][а-я]*\s[А-Я][а-я]+")){
//            throw new InvalidStringException("Некорретный ввод имени");
//        } else {
//            String[] tempString = name.split(" ");
//            FullName fullName = new FullName(tempString[0], tempString[1], tempString[2]);
//            fullName.printName();
//        }
//
//    }
}
