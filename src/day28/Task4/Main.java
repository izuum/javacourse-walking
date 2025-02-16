package day28.Task4;


import day28.Task4.structure.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> testStack = createTestIntStack();
        System.out.println(testStack.getSize());

        System.out.println(testStack.find(4));

        testStack.delete(1);
        testStack.add(8);
        testStack.add(9);

        System.out.println(testStack.getSize());

        System.out.println(testStack);
    }

    private static Stack<Integer> createTestIntStack(){
        Stack<Integer> testStack = new Stack<>();
        testStack.add(1);
        testStack.add(2);
        testStack.add(3);
        testStack.add(4);
        testStack.add(5);
        testStack.add(6);
        testStack.add(7);

        return testStack;
    }
}
