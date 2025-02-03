package day17.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String message = scanner.nextLine();

        scanner.close();

        AnswerType answerType = AnswerType.findAnswerType(message);
        System.out.println(answerType.getAnswer());
    }
}
