package day17.Task3;

import day17.Task3.figure.Figure;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter shape's type:\n 1: Square\n 2: Triangle\n");
        int type = scanner.nextInt();

        System.out.print("Enter shape's length: ");
        int length = scanner.nextInt();

        scanner.close();

        String figureType = createFigure(length, type);
        System.out.println(figureType);
    }

    private static String createFigure(int length, int type){
        Figure figureType;

        switch (type){
            case 1:
                figureType = Figure.SQUARE;
                break;
            case 2:
                figureType = Figure.TRIANGLE;
                break;
            default:
                return "Unknown figure";
        }
        return figureType.createFigure(length);
    }
}