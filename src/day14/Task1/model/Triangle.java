package day14.Task1.model;

public class Triangle extends Figure {
    public static final String TRIANGLE_LEFT_SIDE_ELEMENT = "/";
    public static final String TRIANGLE_RIGHT_SIDE_ELEMENT = "\\";
    public static final String TRIANGLE_HORIZONTAL_SIDE_ELEMENT = "--";

    public Triangle(int length) {
        super(length);
    }

    @Override
    public String createFigure(){
        String triangle = EMPTY_STRING;

        for(int i = 0; i < length; i++){
            for(int j = 0; j < length - 1; j++){
                triangle += EMPTY_ELEMENT;
            }
            triangle += TRIANGLE_LEFT_SIDE_ELEMENT;

            for(int j = 0; j < length - 1; j++){
                triangle += EMPTY_ELEMENT;
            }
            triangle += TRIANGLE_RIGHT_SIDE_ELEMENT + NEW_LINE_SYMBOL;
        }

        triangle += " ";

        for(int i = 0; i < length; i++){
            triangle += TRIANGLE_HORIZONTAL_SIDE_ELEMENT;
        }
        return triangle;
    }
}