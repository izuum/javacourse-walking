package day29.Task1.model;

public class GenericType<T> {
    private final T object;

    public GenericType(T object){
        this.object = object;
    }
    public T getObject(){
        return object;
    }
}
