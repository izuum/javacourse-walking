package day38.Task1;

import day38.Task1.comparators.CarColorComparator;
import day38.Task1.comparators.CarNumberAndYearComparator;
import day38.Task1.comparators.CarNumberComparator;
import day38.Task1.comparators.CarYearComparator;
import day38.Task1.model.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Comparator numberComp = new CarNumberComparator();
        Comparator colorComp = new CarColorComparator().thenComparing(new CarYearComparator());

        List<Car> cars = initCars();

//        cars.sort(numberComp);
//        printList(cars);

        cars.sort(colorComp);
        printList(cars);
    }

    private static List<Car> initCars(){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("RR-111-RR", 2015, "black", true));
        cars.add(new Car("RR-222-RR", 2016, "yellow", true));
        cars.add(new Car("RR-333-RR", 2017, "green", true));
        cars.add(new Car("RR-444-RR", 2002, "blue", true));
        cars.add(new Car("RR-555-RR", 2005, "grey", true));
        cars.add(new Car("RR-666-RR", 1952, "orange", true));
        cars.add(new Car("RR-777-RR", 1986, "red", true));
        cars.add(new Car("RR-888-RR", 2000, "dark-grey", true));
        cars.add(new Car("RR-999-RR", 2025, "purple", true));
        cars.add(new Car("RR-000-RR", 2023, "black", true));

        return cars;
    }

    private static void printList(List<?> list){
        for(Object o : list){
            System.out.println(o);
        }
    }
}