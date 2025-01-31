package day14.Task1.model;

public class Square extends Figure {
    public static final String RECTANGLE_HORIZONTAL_LINE = "-";
    public static final String RECTANGLE_VERTICAL_LINE = "|";

    public Square(int length) {
        super(length);
    }

    @Override
    public String createFigure() {
        String horizontalLine = createHorizontalLine(length);
        String verticalLine = createVerticalLine(length);

        return horizontalLine + verticalLine + horizontalLine;
    }

    private String createHorizontalLine(int length) {
        String horizontalLine = EMPTY_ELEMENT;

        for (int i = 0; i < length; i++) {
            horizontalLine += RECTANGLE_HORIZONTAL_LINE;
        }
        horizontalLine += EMPTY_ELEMENT + NEW_LINE_SYMBOL;
        return horizontalLine;
    }

    private String createVerticalLine(int length) {
        String verticalLinesUnit = getVerticalLinesUnit(length);
        String verticalLines = EMPTY_STRING;

        for (int i = 0; i < length; i++){
            verticalLines += verticalLinesUnit;
        }
        return verticalLines;
    }

    private String getVerticalLinesUnit(int length) {
        String verticalLinesUnit = RECTANGLE_VERTICAL_LINE;

        for (int i = 0; i < length; i++) {
            verticalLinesUnit += EMPTY_ELEMENT;
        }
        verticalLinesUnit += RECTANGLE_VERTICAL_LINE + NEW_LINE_SYMBOL;

        return verticalLinesUnit;
    }
}