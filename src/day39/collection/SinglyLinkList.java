package day39.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class SinglyLinkList<E> implements Collection {
    private Node<E> top;
    private int size;

    public SinglyLinkList(){
    }

    public SinglyLinkList(E top){
        this.top = new Node<>(top);
        size++;
    }

    public void reverse(){
        Node<E> prev = null;
        while(top != null){
            Node<E> next = top.next;
            top.next = prev;
            prev = top;
            top = next;
        }
        top = prev;
    }

    public E getTop(){
        return top.value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        Node<E> temp = top;

        while(temp != null){
            if(Objects.equals(o, temp.value)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return new SinglyLinkedListIterator(top);
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    private static class Node<E> {
        private final E value;
        private Node<E> next;

        private Node(E value) {
            this.value = value;
        }

        private Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }
    }

    private static class SinglyLinkedListIterator<E> implements Iterator<E> {
        private Node<E> current;

        public SinglyLinkedListIterator(Node<E> top) {
            current = top;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E result = current.value;
            current = current.next;

            return result;
        }
    }
}
