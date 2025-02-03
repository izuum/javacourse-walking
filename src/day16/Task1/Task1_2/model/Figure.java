package day16.Task1.Task1_2.model;

public interface Figure {
    String EMPTY_ELEMENT = " ";
    String EMPTY_STRING = "";
    char NEW_LINE_SYMBOL = '\n';

    int getLength();

    String createFigure();
}