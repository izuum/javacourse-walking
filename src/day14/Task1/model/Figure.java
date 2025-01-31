package day14.Task1.model;

public class Figure {
    public static final String EMPTY_ELEMENT = " ";
    public static final String EMPTY_STRING = "";
    public static final char NEW_LINE_SYMBOL = '\n';

    protected final int length;

    protected Figure(int length){
        this.length = length;
    }

    public int getLength(){
        return length;
    }

    public String createFigure(){
        return "Unknown figure";
    }
}
