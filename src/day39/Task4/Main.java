package day39.Task4;

import day39.Task4.collection.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();

        q.push(1);
        q.push(2);
        q.push(3);

        System.out.println(q.pop());
        System.out.println(q.pop());

        q.push(4);

        System.out.println(q.pop());
        System.out.println(q.pop());

//        System.out.println(q.pop());

    }
}
