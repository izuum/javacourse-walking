package day1.Task1;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Значение a: " + a + ". Значение b: " + b);
    }
}