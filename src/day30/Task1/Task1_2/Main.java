package day30.Task1.Task1_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(isPhoneNumberValid(scanner.nextLine()));
    }

    private static boolean isPhoneNumberValid(String number) {
        return number.matches("^\\+7 ?\\(?\\d{3}\\)? ?\\d{3}-?\\d{2}-?\\d{2}$")
                && isValidSpace(number) && isValidBreak(number) && isValidHyphen(number);
    }

    private static boolean isValidSpace(String number){
        if(number.contains(" ")){
            return number.matches("[^ ]+ [^ ]+ [^ ]+");
        }
        return true;
    }

    private static boolean isValidBreak(String number){
        if(number.contains("(") || number.contains(")")){
            return number.matches("[^()]+\\([^()]+\\)[^()]+");
        }
        return true;
    }

    private static boolean isValidHyphen(String number){
        if(number.contains("-")){
            return number.matches("[^-]+-[^-]+-[^-]+");
        }
        return true;
    }
}
