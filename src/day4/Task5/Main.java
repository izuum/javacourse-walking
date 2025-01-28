package day4.Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        while(scanner.nextInt() != 1){
//            System.out.println("Не угадал!");
//        }

        do{
            System.out.println("Не угадал!");
        }while(scanner.nextInt() != 1);

        scanner.close();
    }
}
