package day8.Task1;

public class Counter {
    public String name;
    public int counter;

    public Counter(String name){
        this(name, 0);
    }

    public Counter(String name, int counter){
        this.name = name;
        this.counter = counter;
    }

    public void increment(){
        ++counter;
    }
    public void decrement(){
        --counter;
    }

    public void increment(int userInput){
        counter += userInput;
    }
    public void decrement(int userInput){
        counter -= userInput;
    }
}
