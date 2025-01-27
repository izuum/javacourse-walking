package day3.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

//        if(a.equals("Hi")){
//            System.out.println("Hello");
//        } else if(a.equals("Bye")) {
//            System.out.println("Good bye");
//        } else if(a.equals("How are you")){
//            System.out.println("How are your doing");
//        } else {
//            System.out.println("Unknown message");
//        }

        switch (a){
            case "Hi":
                System.out.println("Hello");
                break;
            case "Bye":
                System.out.println("Good bye");
                break;
            case "How are you":
                System.out.println("How are your doing");
                break;
            default:
                System.out.println("Unknown message");
        }
    }
}
