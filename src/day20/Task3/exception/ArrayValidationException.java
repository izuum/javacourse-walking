package day20.Task3.exception;

public class ArrayValidationException extends IndexOutOfBoundsException {
    public ArrayValidationException(int index) {
        super("Animal with this " + index + " not found");
    }
}
