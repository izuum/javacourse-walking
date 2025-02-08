package day20.Task3.exception;

public class UnknownAnimalException extends RuntimeException{
    public UnknownAnimalException(String message){
        super(message);
    }
}
