package day39.Task4.collection;

import day39.collection.DoubleLinkedList;

public class Queue<E> {
    private final DoubleLinkedList<E> list = new DoubleLinkedList<>();

    public void push(E e){
        list.addLast(e);
    }

    public E pop(){
        E result = list.getTop();
        list.removeTop();

        return result;
    }
}
