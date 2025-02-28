package day38.Task2.model;

import static java.lang.String.valueOf;

public class Car implements Comparable<Car> {
    private final CarIdentifier identifier;
    private String color;
    private boolean actualTechnicalInspection;

    public Car(String number, int year, String color, boolean actualTechnicalInspection) {
        this(new CarIdentifier(number, year), color, actualTechnicalInspection);
    }

    public Car(CarIdentifier identifier, String color, boolean actualTechnicalInspection) {
        this.identifier = identifier;
        this.color = color;
        this.actualTechnicalInspection = actualTechnicalInspection;
    }

    public boolean isActualTechnicalInspection() {
        return actualTechnicalInspection;
    }

    public CarIdentifier getIdentifier() {
        return identifier;
    }

    public String getColor() {
        return color;
    }

    public void setActualTechnicalInspection(boolean actualTechnicalInspection) {
        this.actualTechnicalInspection = actualTechnicalInspection;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int compareTo(Car o) {
        return identifier.compareTo(o.identifier);
    }

    @Override
    public String toString() {
        return """
                number: %s
                year: %d
                color: %s
                actualTechnicalInspection: %s
                """.formatted(
                identifier.getNumber(), identifier.getYear(), color,
                actualTechnicalInspection ? "actual" : "not actual");
    }
}