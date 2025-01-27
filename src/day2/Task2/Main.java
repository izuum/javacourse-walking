package day2.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = scanner.nextInt();

        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        scanner.close();

        System.out.println((Math.pow(a, 3)) > (Math.pow(b, 2)));
    }
}
