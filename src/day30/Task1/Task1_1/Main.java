package day30.Task1.Task1_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(numberValidation(scanner.nextLine()));
    }

    private static boolean numberValidation(String number){
        Pattern pattern = Pattern.compile("^\\+7 \\(\\d{3}\\) \\d{3}-\\d{2}-\\d{2}$");
        Matcher matcher = pattern.matcher(number);

        return matcher.matches();
    }
}
