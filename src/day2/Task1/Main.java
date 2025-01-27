package day2.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите число b: ");
        double b = scanner.nextDouble();

        scanner.close();

        System.out.println();
        System.out.println((b*a*(a+b))/Math.pow(a, 2));
    }
}
