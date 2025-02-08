package day20.Task2.exception;

public class InputValidationException extends RuntimeException {
    public InputValidationException(String message){
        super(message);
    }
}
