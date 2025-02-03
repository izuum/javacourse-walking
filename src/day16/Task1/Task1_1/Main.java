package day16.Task1.Task1_1;

import java.util.Scanner;
import day16.Task1.Task1_1.model.Figure;
import day16.Task1.Task1_1.model.Triangle;
import day16.Task1.Task1_1.model.Square;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter figure's length: ");
        int length = scanner.nextInt();

        System.out.print("Enter figure's type: \n 1. Square \n 2. Triangle \n");
        int figureType = scanner.nextInt();

        scanner.close();

        if (length < 1 || (figureType != 1 && figureType != 2)) {
            System.out.println("Incorrect input.");
            return;
        }

        String figureString = createFigureString(length, figureType);
        System.out.println(figureString);
    }

    private static String createFigureString(int length, int type){
        Figure figure;

        switch (type){
            case 1:
                figure = new Square(length);
                break;
            case 2:
                figure = new Triangle(length);
                break;
            default:
                return "Unknown figure";
        }
        return figure.createFigure();
    }
}
