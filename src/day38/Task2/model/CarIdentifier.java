package day38.Task2.model;

import java.util.Objects;

public class CarIdentifier implements Comparable<CarIdentifier> {
    public final String number;
    public final int year;

    public CarIdentifier(String number, int year){
        this.number = number;
        this.year = year;
    }

    public String getNumber() {
        return number;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }

        if (o == null || !getClass().equals(o.getClass())){
            return false;
        }
        CarIdentifier identifier = (CarIdentifier) o;

        return year == identifier.year && Objects.equals(number, identifier.number);
    }

    @Override
    public int hashCode(){
        int hashCode = number.hashCode();
        hashCode += 31 * year;

        return hashCode;
    }

    @Override
    public int compareTo(CarIdentifier o) {
        if(number.compareTo(o.number) > 0)
            return 1;
        else if(number.compareTo(o.number) < 0)
            return -1;
        else
            return year - o.year;
    }
}