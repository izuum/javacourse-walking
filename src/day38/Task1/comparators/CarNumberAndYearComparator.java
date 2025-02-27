package day38.Task1.comparators;

import day38.Task1.model.Car;
import java.util.Comparator;
import static java.lang.String.valueOf;

public class CarNumberAndYearComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        String carYear1 = valueOf(o1.getIdentifier().getYear());
        String carYear2 = valueOf(o2.getIdentifier().getYear());

        if(o1.getIdentifier().getNumber().compareTo(o2.getIdentifier().getNumber()) == 1
                && carYear1.compareTo(carYear2) == 1)
            return 1;
        else if(o1.getIdentifier().getNumber().compareTo(o2.getIdentifier().getNumber()) == -1
                && carYear1.compareTo(carYear2) == -1)
            return -1;
        else
            return 0;
    }
}
