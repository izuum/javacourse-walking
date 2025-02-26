package day34.Task2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static final String FORMATTER_PATTERN = "dd.MM.yyyy HH:mm:ss";
    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(FORMATTER_PATTERN);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDateTime date = LocalDateTime.parse(scanner.nextLine(), DATE_TIME_FORMATTER);

        scanner.close();

        LocalDateTime currentDate = LocalDateTime.now()
                .truncatedTo(ChronoUnit.SECONDS);

        if(date.isBefore(currentDate)){
            System.out.println("Date is before now.");
        } else if(date.isAfter(currentDate)){
            System.out.println("Date is after now.");
        } else {
            System.out.println("Dates are equal.");
        }
    }
}