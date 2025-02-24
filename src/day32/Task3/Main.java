package day32.Task3;

import day32.Task3.model.Car;
import day32.Task3.service.CarService;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService(initCars());
        carService.saveAll();

        carService.addCar(new Car("QQ-111-QQ", 2025, "BLACK", true));
        carService.addCar(new Car("WW-111-WW", 2025, "BLACK", true));
        carService.addCar(new Car("RR-111-RR", 2015, "yellow", true));
        carService.deleteCar(new Car("RR-111-RR", 2015, "yellow", true));
        carService.deleteCar(new Car("RR-222-RR", 2016, "yellow", true));

        carService.updateCar(new Car("RR-333-RR", 2017, "BLACK", true));


        carService.printCarCatalog();
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
}
