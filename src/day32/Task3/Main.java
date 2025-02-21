package day32.Task3;

import day32.Task3.model.Car;
import day32.Task3.repository.CarRepository;

public class Main {
    public static void main(String[] args) {
        CarRepository carRepository = new CarRepository();

        carRepository.addCar(new Car("QQ-111-QQ", 2025, "BLACK", true));
        carRepository.addCar(new Car("WW-111-WW", 2025, "BLACK", true));

        carRepository.printCarCatalog();
    }
}
