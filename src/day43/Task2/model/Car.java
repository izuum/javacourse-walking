package day43.Task2.model;

public class Car {

    private final CarIdentifire carIdentifire;

    private String color;

    private boolean actualTechnicalInspection;

    private int hashcode;

    public Car(String number, int year, String color, boolean actualTechnicalInspection){
        this(new CarIdentifire(number, year), color, actualTechnicalInspection);
    }

    public Car(CarIdentifire carIdentifire, String color, boolean actualTechnicalInspection) {
        this.carIdentifire = carIdentifire;
        this.color = color;
        this.actualTechnicalInspection = actualTechnicalInspection;

        this.hashcode = hashCode();
    }

    public CarIdentifire getCarIdentifire() {
        return carIdentifire;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setActualTechnicalInspection(boolean actualTechnicalInspection) {
        this.actualTechnicalInspection = actualTechnicalInspection;
    }

    public boolean isActualTechnicalInspection() {
        return actualTechnicalInspection;
    }

    @Override
    public String toString() {
        return """
                number: %s
                year: %d
                color: %s
                actualTechnicalInspection: %s
                """.formatted(
                carIdentifire.getNumber(), carIdentifire.getYear(), color,
                actualTechnicalInspection ? "actual" : "not actual");
    }
}
