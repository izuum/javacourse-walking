package day10.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersLimit = scanner.nextInt();
        scanner.close();

        PrimeNumberFinder pnm = new PrimeNumberFinder(numbersLimit);
        int[] primeNumbers = pnm.findPrimeNumber();

        System.out.println(sum(primeNumbers));
    }

    //    Логика реализации удобного метода-обертки, по аналогии с предыдущей задачей
    static int sum(int[] numbers) {
        return sum(numbers, 0);
    }

    static int sum(int[] numbers, int i) {
        if (i == numbers.length - 1) {
            return numbers[i];
        }

        return numbers[i] + sum(numbers, i + 1);
    }
}
