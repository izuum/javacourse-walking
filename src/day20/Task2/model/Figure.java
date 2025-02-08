package day20.Task2.model;

public interface Figure {
    String EMPTY_ELEMENT = " ";
    String EMPTY_STRING = "";
    char NEW_LINE_SYMBOL = '\n';

    int getLength();

    String createFigure();
}
