package day29.Task2;

public class Main {
    public static void main(String[] args) {
        NumberExponentiation<?> integerExponentatition = createNumberExponentiation(1);
        System.out.println(integerExponentatition.getNumber());

    }

    private static NumberExponentiation<? extends Number> createNumberExponentiation(int number){
        return new NumberExponentiation<>(number);
    }
}

class NumberExponentiation<T extends Number>{
    private final T number;

    public NumberExponentiation(T number){
        this.number = number;
    }

    public double raiseToPower(double a){
        return Math.pow(number.doubleValue(), a);
    }

    public T getNumber() {
        return number;
    }
}