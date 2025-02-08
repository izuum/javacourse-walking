package day21.model;

public class Car {

    private final CarIdentifire identifire;

    private String color;

    private boolean actualTechnicalInspection;

    public Car(String number, int year, String color, boolean actualTechnicalInspection){
        this(new CarIdentifire(number, year), color, actualTechnicalInspection);
    }

    public Car(CarIdentifire identifire, String color, boolean actualTechnicalInspection) {
        this.identifire = identifire;
        this.color = color;
        this.actualTechnicalInspection = actualTechnicalInspection;
    }

    public CarIdentifire getIdentifire() {
        return identifire;
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
                identifire.getNumber(), identifire.getYear(), color,
                actualTechnicalInspection ? "actual" : "not actual");
    }
}
