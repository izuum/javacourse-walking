package day21.service;

import day21.exception.InputValidationException;
import day21.model.Car;
import day21.model.CarIdentifire;

public class CarService {
    private final Car[] cars;

    public CarService(Car[] cars){
        this.cars = cars;
    }

    public Car findCar(CarIdentifire identifire){
        for(Car c: cars){
            if(c.getIdentifire().equals(identifire)){
                return c;
            }
        }
        throw new InputValidationException("This car is not exist");
    }
}