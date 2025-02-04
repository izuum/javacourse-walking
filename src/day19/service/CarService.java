package day19.service;

import day19.model.Car;

public class CarService {
    private final Car[] cars;

    public CarService(Car[] cars){
        this.cars = cars;
    }

    public Car findCar(Car car){
        for(Car c: cars){
            if(c.hashCode() == car.hashCode() && c.equals(car)){
                return c;
            }
        }
        return null;
    }
}
