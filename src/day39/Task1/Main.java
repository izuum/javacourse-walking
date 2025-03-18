package day39.Task1;

import day39.collection.SinglyLinkedList;
import day39.utils.CollectionUtils;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> testIntList = createTestIntList();
        System.out.println(testIntList.getTop());
        testIntList.reverse();
        System.out.println(testIntList.getTop());

        System.out.println(testIntList.size());
        CollectionUtils.dropEvenHashCodeElements(testIntList);
        System.out.println(testIntList.size());

    }

    private static SinglyLinkedList<Integer> createTestIntList() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        return list;
    }
}
