package day4.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        //       System.out.println((num / 10) + (num % 10));
        
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        if (sum < 0) {
            sum *= -1;
        }
        System.out.println(sum);
    }
}
