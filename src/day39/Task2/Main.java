package day39.Task2;

import day39.Task2.collection.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
