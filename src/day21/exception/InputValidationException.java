package day21.exception;

public class InputValidationException extends RuntimeException{
    public InputValidationException(String message){
        super(message);
    }
}
