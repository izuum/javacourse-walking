package day30.Task2.model;

public class FullName {
    private String surname;
    private String name;
    private String lastname;

    public FullName(){
    }

    public FullName(String surname, String name, String lastName){
        this.surname = surname;
        this.name = name;
        this.lastname = lastName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "%s %s %s".formatted(surname, name, lastname);
    }
}
