package day38.Task1.comparators;

import day38.Task1.model.Car;
import java.util.Comparator;

public class CarYearComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if(o1.getIdentifier().getYear() > o2.getIdentifier().getYear())
            return 1;
        else if(o1.getIdentifier().getYear() < o2.getIdentifier().getYear())
            return -1;
        else
            return 0;
    }
}
