package day39.Task3;

import day39.collection.DoubleLinkedList;
import day39.utils.CollectionUtils;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();

        list.add(1);
        list.addLast(2);
        list.addTop(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(0);

        System.out.printf("first: %d, last: %d\n", list.getTop(), list.getLast());
        list.reverse();
        System.out.printf("first: %d, last: %d\n", list.getTop(), list.getLast());

        list.removeLast();
        list.removeTop();
        System.out.printf("first: %d, last: %d\n", list.getTop(), list.getLast());

        System.out.println(list.size());
        CollectionUtils.dropEvenHashCodeElements(list);
        System.out.println(list.size());
    }
}
