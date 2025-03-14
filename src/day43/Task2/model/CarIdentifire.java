package day43.Task2.model;

import java.util.Objects;

public class CarIdentifire {
    private final String number;

    private final int year;

    public CarIdentifire(String number, int year){
        this.number = number;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getNumber() {
        return number;
    }

    public boolean equals(Object o){
        if(this == o){
            return true;
        }

        if(o == null || !getClass().equals(o.getClass())){
            return false;
        }
        CarIdentifire identifire = (CarIdentifire) o;
        return year == identifire.year && Objects.equals(number, identifire.number);
    }

    public int hashCode(){
        int hashCode = number.hashCode();
        hashCode += 31 * year;
        return hashCode;
    }
}