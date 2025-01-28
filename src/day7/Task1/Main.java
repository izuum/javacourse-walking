package day7.Task1;

public class Main {
    public static void main(String[] args) {
        String[] s = {"fdf", "dsfd", "vbvb", "ewre", "ewrewtt"};

        System.out.println(concatString(s));
    }

    public static String concatString(String[] mass){
        String result = "";
        for(String s: mass){
            result += s + " ";
        }
        return result;
    }
}
