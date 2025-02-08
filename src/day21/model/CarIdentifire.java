package day21.model;

import java.util.Objects;

public class CarIdentifire {
    private final String number;
    private final int year;

    public CarIdentifire(String number, int year){
        this.number = number;
        this.year = year;
    }

    public String getNumber(){
        return number;
    }

    public int getYear(){
        return year;
    }

    @Override
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

    @Override
    public int hashCode(){
        int hashcode = number.hashCode();
        hashcode += 31 * year;

        return hashcode;
    }
}
