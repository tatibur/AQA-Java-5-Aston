package by.aston.aqa;
/*Применяя интерфейсы написать программу расчета периметра и площади геометрических фигур: круг, прямоугольник, треугольник.
Задать для каждой фигуры цвет заливки и цвет границы. Результат полученных характеристик [ Периметр, площадь, цвет фона, цвет границ ] по каждой фигуре вывести в консоль.
Попробуйте реализовать базовые методы, такие как расчет периметра фигур, в качестве дефолтных методов в интерфейсе.*/

public class MainFigure {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("Треугольник", "жёлтый", "красный");
        Rectangle rectangle = new Rectangle("Прямоугольник", "голубой", "синий");
        Circle circle = new Circle("Круг", "коричневый", "чёрный");

        System.out.println(triangle.toString());
        System.out.println("Периметр = " + triangle.getPerimeter(2, 2, 4));
        System.out.println("Площадь = " + triangle.getArea(5, 6, 7));
        System.out.println();
        System.out.println(rectangle.toString());
        System.out.println("Периметр = " + rectangle.getPerimeter(2, 2));
        System.out.println("Площадь = " + rectangle.getArea(5, 6));
        System.out.println();
        System.out.println(circle.toString());
        System.out.println("Периметр = " + circle.getPerimeter(5));
        System.out.println("Площадь = " + circle.getArea(8));
    }
}
