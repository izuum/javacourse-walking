package day4.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= 10; i++){
            if(i == num){
                System.out.println("Числа равны");
            } else if(i % 2 == 0){
                System.out.printf("%d + %d = %d\n", i, num, i + num);
            } else {
                System.out.printf("%d - %d = %d\n", i, num, i - num);
            }
        }
    }
}
