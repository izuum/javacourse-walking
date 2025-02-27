package day38.Task1.comparators;

import day38.Task1.model.Car;
import java.util.Comparator;

public class CarColorComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}
