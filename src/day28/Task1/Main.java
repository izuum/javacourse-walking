package day28.Task1;

public class Main {
    public static void main(String[] args) {
        NumberExponentiation<Byte> byteNumber = new NumberExponentiation<>((byte) 5);
        NumberExponentiation<Short> shortNumber = new NumberExponentiation<>((short) 5);
        NumberExponentiation<Integer> integerNumber = new NumberExponentiation<>(5);
        NumberExponentiation<Long> longNumber = new NumberExponentiation<>(5L);
        NumberExponentiation<Double> doubleNumber = new NumberExponentiation<>(5d);
        NumberExponentiation<Float> floatNumber = new NumberExponentiation<>(5f);

        System.out.println(byteNumber.raiseToPower(2));
        System.out.println(shortNumber.raiseToPower(2));
        System.out.println(integerNumber.raiseToPower(2));
        System.out.println(longNumber.raiseToPower(2));
        System.out.println(doubleNumber.raiseToPower(2));
        System.out.println(floatNumber.raiseToPower(2));

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
