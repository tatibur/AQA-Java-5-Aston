package by.aston.aqa;

public class Triangle extends Figure {
    public Triangle(String name, String colorFigure, String colorBorder) {
        super(name, colorFigure, colorBorder);
        this.name = name;
        this.colorFigure = colorFigure;
        this.colorBorder = colorBorder;
    }

    public double getPerimeter(int side1, int side2, int side3) {
        return side1 + side2 + side3;
    }

    public double getArea(int side1, int side2, int side3) {
        return Math.sqrt(((double) (side1 + side2 + side3) / 2) * (((double) (side1 + side2 + side3) / 2) - side1) * (((double) (side1 + side2 + side3) / 2) - side2) * (((double) (side1 + side2 + side3) / 2) - side3));
    }
}
