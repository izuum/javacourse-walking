package day16.Task2;

import day16.Task2.model.impl.Bye;
import day16.Task2.model.impl.Hi;
import day16.Task2.model.impl.HowAreYou;
import day16.Task2.model.Message;
import day16.Task2.model.impl.Unknown;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        scanner.close();

        Message message;

        switch (a){
            case "Hi":
                message = new Hi();
                break;
            case "Bye":
                message = new Bye();
                break;
            case "How are you":
                message = new HowAreYou();
                break;
            default:
                message = new Unknown();
        }
        System.out.println(message.printMessage());
    }
}
