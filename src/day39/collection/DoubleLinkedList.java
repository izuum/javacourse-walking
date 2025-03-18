package day39.collection;

import java.util.*;

public class DoubleLinkedList<E> implements Collection<E> {
    private Node<E> top;
    private Node<E> last;

    private int size;

    public DoubleLinkedList() {

    }

    public DoubleLinkedList(E e) {
        this.top = new Node<>(e);
        this.last = top;
        size++;
    }

    public void reverse() {
        if (size <= 1) {
            return;
        }

        last = top;

        Node<E> current = top;
        Node<E> temp = null;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        top = temp.prev;
    }

    public E getTop() {
        return top.value;
    }

    public E getLast() {
        return last.value;
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

        while (temp != null) {
            if (Objects.equals(o, temp.value)) {
                return true;
            }

            temp = temp.next;
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new DoubleLinkedListIterator<>(top);
    }

    @Override
    public Object[] toArray() {
        Object[] arr = new Object[size];
        Node<E> temp = top;

        for (int i = 0; i < size; i++) {
            arr[i] = temp.value;
            temp = temp.next;
        }

        return arr;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return (T[]) Arrays.copyOf(toArray(), size, a.getClass());
    }

    @Override
    public boolean add(E e) {
        return addLast(e);
    }

    public boolean addLast(E e) {
        Node<E> l = last;
        Node<E> node = new Node<>(l, e, null);
        last = node;

        if (l == null) {
            top = node;
        } else {
            l.next = node;
        }
        size++;

        return true;
    }

    public boolean addTop(E e) {
        Node<E> t = top;
        Node<E> node = new Node(null, e, t);
        top = node;

        if (t == null) {
            last = node;
        } else {
            t.prev = node;
        }

        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        Node<E> temp = top;

        if (Objects.equals(o, top.value)) {
            top = top.next;
            size--;

            if (top == null) {
                last = null;
            }

            return true;
        }
        while (temp.next != null) {
            if (Objects.equals(o, temp.next.value)) {
                temp.next = temp.next.next;
                size--;

                if (temp.next == null) {
                    last = null;
                }

                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void removeTop() {
        if (size == 0) {
            return;
        }
        top = top.next;
        size--;

        if (top == null) {
            last = null;
        }
    }

    public void removeLast() {
        if (size == 0) {
            return;
        }
        last = last.prev;
        size--;

        if (last == null) {
            top = null;
        }
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object e : c) {
            if (!contains(e)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        for (E e : c) {
            add(e);
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean result = false;

        for (Object e : c) {
            if (remove(e)) {
                result = true;
            }

        }
        return result;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        while(!c.contains(top.value)){
            top = top.next;
            size--;
        }

        Node<E> temp = top;
        while(temp.next != null){
            if(!c.contains(temp.next.value)){
                temp.next = temp.next.next;
                size--;
            }

            temp = temp.next;
        }
        return size > 0;
    }

    @Override
    public void clear() {
        top = null;
        size = 0;
    }

    private static class Node<E> {
        private final E value;
        private Node<E> prev;
        private Node<E> next;

        public Node(E value) {
            this.value = value;
        }

        public Node(Node<E> prev, E value, Node<E> next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }

    private static class DoubleLinkedListIterator<E> implements Iterator<E> {
        private Node<E> current;

        public DoubleLinkedListIterator(Node<E> top) {
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
