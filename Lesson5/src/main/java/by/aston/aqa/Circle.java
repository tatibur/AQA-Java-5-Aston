package by.aston.aqa;

public class Circle extends Figure {
    final float PI = 3.14f;

    public Circle(String name, String colorFigure, String colorBorder) {
        super(name, colorFigure, colorBorder);
        this.name = name;
        this.colorFigure = colorFigure;
        this.colorBorder = colorBorder;
    }

    public double getPerimeter(int radius) {
        return 2 * PI * radius;
    }

    public double getArea(int radius) {
        return PI * radius * radius;
    }

}
