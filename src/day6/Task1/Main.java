package day6.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        selectMessage(scanner.nextLine());

        scanner.close();



    }
    public static void selectMessage(String s){
        switch (s){
            case "Hi":
                printMessage("Hello");
                break;
            case "Bye":
                printMessage("Good bye");
                break;
            case "How are you":
                printMessage("How are your doing");
                break;
            default:
                printMessage("Unknown message");
        }
    }

    public static void printMessage(String s){
        System.out.println(s);
    }
}
