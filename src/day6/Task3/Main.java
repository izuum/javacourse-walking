package day6.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        String horizontalLine = " ";

        for(int i = 0; i < a; i++){
            horizontalLine += "-";
        }
        horizontalLine += " \n";

        String verticalLinesUnit = "|";
        for(int i = 0; i < a; i++){
            verticalLinesUnit += " ";
        }
        verticalLinesUnit += "|\n";

        String verticalLines = "";
        for (int i = 0; i < b; i++){
            verticalLines += verticalLinesUnit;
        }

        printRectangle(horizontalLine, verticalLines);
    }

    public static void printRectangle(String a, String b){
        System.out.println(a + b + a);
    }

}
