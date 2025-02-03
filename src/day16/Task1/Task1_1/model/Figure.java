package day16.Task1.Task1_1.model;

public abstract class Figure {

    public static final String EMPTY_ELEMENT = " ";
    public static final String EMPTY_STRING = "";
    public static final char NEW_LINE_SYMBOL = '\n';

    protected final int length;

    protected Figure(int length){
        this.length = length;
    }

    public abstract String createFigure();
}
