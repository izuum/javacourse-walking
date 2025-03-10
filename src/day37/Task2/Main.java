package day37.Task2;

import day37.Task2.collection.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> singlyLinkedList = createTestIntList();

        System.out.println(singlyLinkedList.size());
        System.out.println(singlyLinkedList.getTop());
        System.out.println();

        singlyLinkedList.remove(1);
        singlyLinkedList.add(8);
        singlyLinkedList.add(2);
        singlyLinkedList.add(3);

        System.out.println();
        System.out.println(singlyLinkedList.size());
        System.out.println(singlyLinkedList.getTop());
        System.out.println();

        for(int i : singlyLinkedList){
            System.out.println(i);
        }
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
