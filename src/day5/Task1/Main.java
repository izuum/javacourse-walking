package day5.Task1;

public class Main {
    public static void main(String[] args) {
        char[] name = {'R', 'o', 'm', 'a', 'n'};

        String s = "";
//        for(char a: name){
//            System.out.print(a);
//        }

        for (char a: name){
            s += a;
        }
        System.out.println(s);
    }
}
