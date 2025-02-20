package day32.Task1;

import day32.Task1.model.Car;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static final String CAR_CATALOG_FILE_PATH = "./resources/files/lesson32/task1/carCatalog.txt";

    public static void main(String[] args) {
        Car[] cars = initCars();

        System.out.println("Write car catalog started");

        try (FileOutputStream fileOutputStream = new FileOutputStream(CAR_CATALOG_FILE_PATH)) {
            for (Car car : cars) {
                fileOutputStream.write(mapCarToFileView(car).getBytes());
                fileOutputStream.write('\n');
            }
        } catch (IOException e){
            throw new RuntimeException("Error of file writing", e);
        }

        System.out.println("File writing finished");

    }

    private static Car[] initCars() {
        Car car1 = new Car("RR-111-RR", 2015, "yellow", true);
        Car car2 = new Car("RR-222-RR", 2016, "yellow", true);
        Car car3 = new Car("RR-333-RR", 2017, "yellow", true);
        Car car4 = new Car("RR-444-RR", 2018, "yellow", true);
        Car car5 = new Car("RR-555-RR", 2018, "yellow", true);
        Car car6 = new Car("RR-666-RR", 2018, "yellow", true);
        Car car7 = new Car("RR-777-RR", 2018, "yellow", true);
        Car car8 = new Car("RR-888-RR", 2018, "yellow", true);
        Car car9 = new Car("RR-999-RR", 2018, "yellow", true);
        Car car10 = new Car("RR-000-RR", 2018, "yellow", true);

        return new Car[]{car1, car2, car3, car4, car5, car6, car7, car8, car9, car10};
    }

    private static String mapCarToFileView(Car car) {
        return "%s;%d;%s;%s".formatted(
                car.getNumber(), car.getYear(), car.getColor(), car.isActualTechnicalInspection());
    }
}


