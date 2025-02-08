package day20.Task2;

import day20.Task2.exception.InputValidationException;
import day20.Task2.model.Figure;
import day20.Task2.model.Square;
import day20.Task2.model.Triangle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter figure's length: ");
        int length = scanner.nextInt();

        System.out.print("Enter figure's type: \n 1. Square \n 2. Triangle \n");
        int figureType = scanner.nextInt();

        scanner.close();

        if (length < 1){
            throw new InputValidationException("Incorrect length input!");
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
                throw new InputValidationException("Incorrect figure's type input!");
        }
        return figure.createFigure();
    }
}
