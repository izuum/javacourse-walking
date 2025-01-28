package day7.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        scanner.close();

        if (num <= 0) {
            System.out.println("Число должно быть больше нуля");
            return;
        }
        System.out.println(calculateSqrt(num));

    }
    static double calculateSqrt(int num){
        return calculateSqrt(1, num);
    }

    static double calculateSqrt(int num, int maxNum) {
        if(num == maxNum){
            return Math.sqrt(num);
        }
        return Math.sqrt(num + (calculateSqrt(num + 1, maxNum)));
    }
}
