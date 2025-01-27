package day4.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        if(num < 0){
            System.out.println("Error");
        } else if(num == 0) {
            System.out.println(1);
        } else {
            int result = 1;
            for (int i = 1; i <= num; i++){
                result *= i;
            }
            System.out.println(result);
        }
    }
}
