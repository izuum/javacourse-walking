package day3.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число a: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число b: ");
        int b = scanner.nextInt();
        scanner.close();

        if(a % 2 != 0){
            System.out.println((double) a / b);
        } else {
            System.out.println(a * b);
        }
    }
}
