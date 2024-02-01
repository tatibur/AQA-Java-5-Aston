package by.aston.aqa;

public class Rectangle extends Figure {
    public Rectangle(String name, String colorFigure, String colorBorder) {
        super(name, colorFigure, colorBorder);
        this.name = name;
        this.colorFigure = colorFigure;
        this.colorBorder = colorBorder;
    }

    public double getPerimeter(int length, int width) {
        return (length + width) * 2;
    }

    public double getArea(int length, int width) {
        return length * width;
    }
}