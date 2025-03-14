package day43.Task2.service;

import day43.Task2.model.Car;
import day43.Task2.model.CarIdentifire;
import java.util.HashMap;
import java.util.Map;

public class CarService {
    private final Map<CarIdentifire, Car> cars = new HashMap<>();

    public CarService(Car[] cars){
        for(Car car : cars){
            this.cars.put(car.getCarIdentifire(), car);
        }
    }

    public Car findCar(CarIdentifire carIdentifire){
        return cars.get(carIdentifire);
    }
}