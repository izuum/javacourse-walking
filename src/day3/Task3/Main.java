package day3.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String surname = scanner.nextLine();
        String name = scanner.nextLine();
        String lastname = scanner.nextLine();
        scanner.close();

        System.out.println(surname);
        System.out.println(name);
        System.out.println(lastname);
        System.out.println();
        System.out.printf("%s %s %s", surname, name, lastname);
    }
}
