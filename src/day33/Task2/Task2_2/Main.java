package day33.Task2.Task2_2;

import day33.Task2.Task2_2.model.Car;

import java.io.*;

public class Main {

    public static final String CAR_CATALOG_FILE_PATH = "./resource/files/lesson33/task2/carCatalog.txt";

    public static void main(String[] args) {
        String carStr = readCarCatalog();
        String[] carStrArray = carStr.split("\n");

        Car[] cars = new Car[carStrArray.length];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = parseCar(carStrArray[i]);
        }

        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println("Reading car catalog finished");
    }

    private static String readCarCatalog() {
        System.out.println("Reading car catalog started");

        StringBuilder carStr = new StringBuilder();


        try (FileInputStream fis = new FileInputStream(CAR_CATALOG_FILE_PATH);
             BufferedInputStream bis = new BufferedInputStream(fis)) {
            int c;
            while ((c=bis.read())!=-1) {
                carStr.append((char) c);
            }
        } catch (IOException e) {
            throw new RuntimeException("Error reading symbol", e);
        }
        return carStr.toString();
    }

    private static Car parseCar(String carStr) {
        String[] splitCarStr = carStr.split(";");

        String number = splitCarStr[0].equals("null") ? null : splitCarStr[0];
        int year = Integer.parseInt(splitCarStr[1]);
        String color = splitCarStr[2].equals("null") ? null : splitCarStr[2];
        boolean actualTechnicalInspection = splitCarStr[3].equals("true");

        return new Car(number, year, color, actualTechnicalInspection);
    }
}