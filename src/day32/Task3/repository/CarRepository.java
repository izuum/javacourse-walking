package day32.Task3.repository;

import day32.Task3.model.Car;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class CarRepository {

    public static final String CAR_CATALOG_FILE_PATH = "./resource/files/lesson32/task1/carCatalog.txt";

    public Car[] cars = new Car[]{};

    public CarRepository() {
    }

    public void addCar(Car car) {
        cars = getCarCatalog();
        Car[] newCars = new Car[cars.length + 1];

        newCars = cars;
        newCars[newCars.length] = car;

        cars = newCars;

        commitChangesToCarCatalog();
    }


    public void printCarCatalog() {
        Car[] cars = getCarCatalog();

        for (Car car : cars) {
            System.out.println(car);
        }
    }

    private void commitChangesToCarCatalog() {
        try (FileOutputStream fos = new FileOutputStream(CAR_CATALOG_FILE_PATH)) {

            for (Car car : cars) {
                fos.write(mapCarToFileView(car).getBytes());
                fos.write('\n');
            }

        } catch (IOException e) {
            throw new RuntimeException("Error writitng file");
        }
    }

    private Car[] getCarCatalog() {
        String carStr = readFileCarCatalog();
        String[] carStrArray = carStr.split("\n");

        for (int i = 0; i < carStrArray.length; i++) {
            cars[i] = parseCar(carStrArray[i]);
        }

        return cars;
    }

    private String readFileCarCatalog() {
        StringBuilder carStr = new StringBuilder();

        try (FileInputStream fis = new FileInputStream(CAR_CATALOG_FILE_PATH)) {
            boolean isReadingFinished = false;

            while (!isReadingFinished) {
                int symbol = fis.read();

                if (symbol == -1) {
                    isReadingFinished = true;
                } else {
                    carStr.append((char) symbol);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException("Error reading file");
        }
        return carStr.toString();

    }

    private Car parseCar(String carStr) {
        String[] splitCarStr = carStr.split(";");

        String number = splitCarStr[0].equals("null") ? null : splitCarStr[0];
        int year = Integer.parseInt(splitCarStr[1]);
        String color = splitCarStr[2].equals("null") ? null : splitCarStr[2];
        boolean isActualTechnicalInspection = splitCarStr[3].equals("true");

        return new Car(number, year, color, isActualTechnicalInspection);
    }

    private static String mapCarToFileView(Car car) {
        return "%s;%d;%s;%s".formatted(
                car.getNumber(), car.getYear(), car.getColor(), car.isActualTechnicalInspection());
    }
}
