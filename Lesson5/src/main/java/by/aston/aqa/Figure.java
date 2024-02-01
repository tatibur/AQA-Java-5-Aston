package by.aston.aqa;

public abstract class Figure implements FigureCalculation {
    String name;
    String colorFigure;
    String colorBorder;

    public Figure(String name, String colorFigure, String colorBorder) {
        this.name = name;
        this.colorFigure = colorFigure;
        this.colorBorder = colorBorder;
    }

    public String toString() {
        return "Название фигуры: " + name + " Цвет фигуры: " + colorFigure + " Цвет границ: " + colorBorder;
    }
}
