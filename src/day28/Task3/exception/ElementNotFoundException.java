package day28.Task3.exception;

public class ElementNotFoundException extends RuntimeException{
    public ElementNotFoundException(){
        super("Desired element not found");
    }
}
