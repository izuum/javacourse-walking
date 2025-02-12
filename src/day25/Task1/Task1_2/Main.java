package day25.Task1.Task1_2;

import java.util.Scanner;

public class Main {
    public static final String SQUARE_HORIZONTAL_ELEMENT = "-";
    public static final String SQUARE_VERTICAL_ELEMENT = "|";
    public static final String TRIANGLE_HORIZONTAL_ELEMENT = "--";
    public static final String TRIANGLE_LEFT_SIDE_ELEMENT = "/";
    public static final String TRIANGLE_RIGHT_SIDE_ELEMENT = "\\";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter figure's length: ");
        int length = scanner.nextInt();

        if(length < 1){
            scanner.close();
            throw new RuntimeException("Incorrect figure's length input");
        }

        System.out.println("Enter figure's type:\n 1: Square\n 2: Triangle\n");
        int figureType = scanner.nextInt();

        scanner.close();

        String figureString = new Main().createFigure(length, figureType);
        System.out.println(figureString);
    }

    private String createFigure(int length, int type){
        Figure figure;

        switch (type){
            case 1:
                figure = new Square(length);
                break;
            case 2:
                figure = new Triangle(length);
                break;
            default:
                throw new RuntimeException("Unknown figure");
        }
        return figure.createFigure();
    }

    private class Square implements Figure {

        private final int length;

        public Square(int length){
            this.length = length;
        }
        @Override
        public int getLength() {
            return length;
        }

        @Override
        public String createFigure() {
            String horizontalLine = createHorizontalLine(length);
            String verticalLine = createVerticalLine(length);

            return horizontalLine + verticalLine + horizontalLine;
        }

        private String createHorizontalLine(int length){
            String horizontalLine = EMPTY_ELEMENT;

            for (int i = 0; i < length; i++){
                horizontalLine += SQUARE_HORIZONTAL_ELEMENT;
            }
            horizontalLine += EMPTY_ELEMENT + NEW_LINE_SYMBOL;
            return horizontalLine;
        }

        private String createVerticalLine(int length){
            String verticalLineUnit = getVerticalLinesUnit(length);
            String verticalLine = EMPTY_STRING;

            for (int i  = 0; i < length; i++){
                verticalLine += verticalLineUnit;
            }
            return verticalLine;
        }

        private String getVerticalLinesUnit(int length){
            String verticalLinesUnit = SQUARE_VERTICAL_ELEMENT;

            for (int i = 0; i < length; i++){
                verticalLinesUnit += EMPTY_ELEMENT;
            }
            verticalLinesUnit += SQUARE_VERTICAL_ELEMENT + NEW_LINE_SYMBOL;

            return verticalLinesUnit;
        }
    }

    private class Triangle implements Figure {

        private final int length;

        public Triangle(int length){
            this.length = length;
        }

        @Override
        public int getLength() {
            return length;
        }

        @Override
        public String createFigure() {
            String triangle = EMPTY_STRING;

            for (int i = 0; i < length; i++){
                for (int j = 0; j < length - 1; j++){
                    triangle += EMPTY_ELEMENT;
                }
                triangle += TRIANGLE_LEFT_SIDE_ELEMENT;

                for (int j = 0; j < length - 1; j++){
                    triangle += EMPTY_ELEMENT;
                }
                triangle += TRIANGLE_RIGHT_SIDE_ELEMENT + NEW_LINE_SYMBOL;
            }

            triangle += " ";

            for (int i = 0; i < length; i++){
                triangle += TRIANGLE_HORIZONTAL_ELEMENT;
            }
            return triangle;
        }
    }
}
