package day34.Task1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static final String FORMATTER_PATTERN = "dd.MM.yyyy HH:mm:ss";
    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(FORMATTER_PATTERN);

    public static void main(String[] args) {
        System.out.println(parseDate("20.12.2022 20:16:00"));
        System.out.println(parseDate("20.06.2002 20:24:00"));

    }

    private static LocalDateTime parseDate(String date){
        return LocalDateTime.parse(date, DATE_TIME_FORMATTER);
    }
}