package day28.Task4.exception;

public class ElementNotFoundException extends RuntimeException{
    public ElementNotFoundException(){
        super("Desired value is not found");
    }
}
