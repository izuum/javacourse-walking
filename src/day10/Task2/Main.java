package day10.Task2;

public class Main {
    public static void main(String[] args) {
        Counter evenCounter = new Counter("Четные числа");
        Counter oddCounter = new Counter("Нечетные числа");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenCounter.increment();
            } else {
                oddCounter.increment();
            }
        }

        printCounterValue(evenCounter);
        printCounterValue(oddCounter);
    }

    static void printCounterValue(Counter counter) {
        System.out.printf("%s: %d\n", counter.name, counter.counter);
    }
}
