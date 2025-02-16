package day28.Task4.structure;

import day28.Task3.exception.ElementNotFoundException;

import java.util.Objects;

public class Stack<T> {
    private Node<T> top;
    private long size;

    public Stack(){
    }

    public Stack(T top){
        this.top = new Node(top);
        size++;
    }

    public void add(T element){
        top = new Node<>(element, top);
        size++;
    }

    public void delete(T element){
        Node<T> temp = top;

        if(Objects.equals(element, top.value)){
            top = top.nextValue;
            size--;

            return;
        }

        while(temp.nextValue != null){
            if(Objects.equals(element, temp.nextValue.value)){
                temp.nextValue = temp.nextValue.nextValue;
                size--;

                return;
            }
            temp = temp.nextValue;
        }
        throw new ElementNotFoundException();
    }

    public T find(T element){
        Node<T> temp = top;

        while(temp != null) {
            if(Objects.equals(element, temp.value)){
                return temp.value;
            }
            temp = temp.nextValue;
        }

        throw new ElementNotFoundException();
    }

    public long getSize() {
        return size;
    }

    @Override
    public String toString(){
        StringBuilder toStringValue = new StringBuilder("[");
        Node<T> temp = top;

        while(temp != null){
            toStringValue.append(temp.value);

            if(temp.nextValue != null){
                toStringValue.append(", ");
            }

            temp = temp.nextValue;
        }

        toStringValue.append("]");

        return toStringValue.toString();
    }

    private static class Node<T> {
        private final T value;
        private Node<T> nextValue;

        private Node(T value){
            this.value = value;
        }

        private Node(T value, Node<T> nextValue){
            this.value = value;
            this.nextValue = nextValue;
        }
    }
}
