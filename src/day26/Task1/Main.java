package day26.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = requireInt(scanner, "Enter rectangle's length: ");
        int width = requireInt(scanner, "Enter rectangle's width: ");
        scanner.close();

        StringBuilder rectangle = createRectangle(length, width);
        System.out.println(rectangle);
    }

    public static StringBuilder createRectangle(int length, int width){

        StringBuilder horizontalLine = createHorizontalLine(length);
        StringBuilder verticalLines = createVerticalLine(length, width);

        return new StringBuilder()
                .append(horizontalLine)
                .append(verticalLines)
                .append(horizontalLine);
    }

    static int requireInt(Scanner scanner, String requireMessage){
        System.out.println(requireMessage);

        return scanner.nextInt();
    }

    static StringBuilder createHorizontalLine(int length){
        StringBuilder horizontalLine = new StringBuilder(" ");

        for(int i = 0; i < length; i++){
            horizontalLine.append("-");
        }
        horizontalLine.append(" \n");

        return horizontalLine;
    }

    static StringBuilder createVerticalLine(int length, int width){
        StringBuilder verticalLinesUnit = getVerticalLinesUnit(length);

        StringBuilder verticalLines = new StringBuilder();
        for (int i = 0; i < width; i++){
            verticalLines.append(verticalLinesUnit);
        }

        return verticalLines;
    }

    static StringBuilder getVerticalLinesUnit(int length){
        StringBuilder verticalLinesUnit = new StringBuilder("|");

        for(int i = 0; i < length; i++){
            verticalLinesUnit.append(" ");
        }
        verticalLinesUnit.append("|\n");

        return verticalLinesUnit;
    }
}