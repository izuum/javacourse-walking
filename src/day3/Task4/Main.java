package day3.Task4;

import java.util.Scanner;

public class Main {
    public final static int INT_MAX = Integer.MAX_VALUE;
    public final static int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if(a % 2 == 0 || b % 3 == 0){
//            if (a == b){
//                System.out.println(true);
//            } else {
//                System.out.println(false);
//            }
            System.out.println(a == b);
        }

        if(a % 2 == 0 && a % 3 == 0){
            double c = Math.pow(a, b);
            if(c > INT_MAX){
                System.out.println("Результат выражения слишком большой");
            } else {
                System.out.println((int)c);
            }
        }
    }
}
