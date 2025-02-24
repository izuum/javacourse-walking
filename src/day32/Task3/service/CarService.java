package day32.Task3.service;

import day32.Task3.model.Car;
import day32.Task3.repository.CarRepository;

import java.util.Arrays;

public class CarService {
    private Car[] cars;
    private final CarRepository carRepository = new CarRepository();

    public CarService(Car[] cars){
        this.cars = cars;
    }

    public void addCar(Car car) {
        cars = carRepository.getCarCatalog();

        if(findCar(car)){
            cars = Arrays.copyOf(cars, cars.length+1);
            cars[cars.length - 1] = car;
            carRepository.commitChangesToCarCatalog(cars);
        } else {
            System.out.printf(
                    "This car is already exist - %s,%d,%s,%s\n",
                    car.getNumber(), car.getYear(), car.getColor(), car.isActualTechnicalInspection());
        }
    }

    public void deleteCar(Car car){
        cars = carRepository.getCarCatalog();
        Integer index = findIndexCar(car);
        if(index == null) {
            System.out.println("Car is not exist");
            return;
        }
        if(index == cars.length - 1){
            cars = Arrays.copyOf(cars, cars.length - 1);
            return;
        }

        Car[] newCars = new Car[cars.length -1];
        int i = 0;
        int j = 0;
        while(j < newCars.length){
            if(i != index) {
                newCars[j] = cars[i];
                j++;
            }
            i++;
        }
        cars = newCars;
        carRepository.commitChangesToCarCatalog(cars);
    }
    public void updateCar(Car car) {
        cars = carRepository.getCarCatalog();

        if(!findCar(car)){
            for(Car c : cars){
                if(c.equals(car)){
                    c.setColor(car.getColor());
                    c.setActualTechnicalInspection(car.isActualTechnicalInspection());
                }
            }
        }
        carRepository.commitChangesToCarCatalog(cars);
    }

    public void printCarCatalog() {
        cars = carRepository.getCarCatalog();

        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public void saveAll(){
        carRepository.commitChangesToCarCatalog(cars);
    }

    private boolean findCar(Car car){
        for(Car c : cars){
            if(c.hashCode() == car.hashCode() && c.equals(car)){
                return false;
            }
        }
        return true;
    }

    private Integer findIndexCar(Car car){
        for(int i = 0; i < cars.length; i++){
            if(cars[i].hashCode() == car.hashCode() && cars[i].equals(car)){
                return i;
            }
        }
        return null;
    }
}
