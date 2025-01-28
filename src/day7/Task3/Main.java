package day7.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();

        if(a <= 0){
            System.out.println("Число не должно быть больше 0");
            return;
        }

        System.out.println("Факториал числа a: " + recurs(a));
    }

    static int recurs(int a) {
        if(a == 0) return 0;

        if(a == 1) return 1;

        return a * recurs(a - 1);
    }
}
