package day17.Task3.figure;

public enum Figure {
    SQUARE {
        public static final String RECTANGLE_HORIZONTAL_LINE = "-";
        public static final String RECTANGLE_VERTICAL_LINE = "|";

        @Override
        public String createFigure(int length) {
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

            for (int i = 0; i < length; i++) {
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
    },
    TRIANGLE {
        public static final String TRIANGLE_LEFT_SIDE_ELEMENT = "/";
        public static final String TRIANGLE_RIGHT_SIDE_ELEMENT = "\\";
        public static final String TRIANGLE_HORIZONTAL_SIDE_ELEMENT = "--";

        @Override
        public String createFigure(int length) {
            String triangle = EMPTY_STRING;

            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length - i; j++) {
                    triangle += EMPTY_ELEMENT;
                }
                triangle += TRIANGLE_LEFT_SIDE_ELEMENT;

                for (int j = 0; j < length - 1; j++) {
                    triangle += EMPTY_ELEMENT;
                }
                triangle += TRIANGLE_RIGHT_SIDE_ELEMENT + NEW_LINE_SYMBOL;
            }

            triangle += " ";

            for (int i = 0; i < length; i++) {
                triangle += TRIANGLE_HORIZONTAL_SIDE_ELEMENT;
            }
            return triangle;
        }
    };

    public static final String EMPTY_ELEMENT = " ";
    public static final String EMPTY_STRING = "";
    public static final char NEW_LINE_SYMBOL = '\n';

    public abstract String createFigure(int length);
}
