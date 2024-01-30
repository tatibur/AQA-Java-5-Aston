package by.aston.aqa;

public class MainFigure {
    public static void main(String[] args) {
        Triangle tr1 = new Triangle(2, 3, 4, 3, "жёлтый", "зелёный");
        Rectangle rect1 = new Rectangle(2, 5, 2, 5, "голубой", "синий");
        Circle c1 = new Circle(7, "красный", "коричневый");

        // условие
        System.out.println("Применяя интерфейсы написать программу расчета периметра и площади геометрических фигур: круг, прямоугольник, треугольник.");
        System.out.println("Задать для каждой фигуры цвет заливки и цвет границы.");
        System.out.println("Результат полученных характеристик [ Периметр, площадь, цвет фона, цвет границ ] по каждой фигуре вывести в консоль.");
        System.out.println("Попробуйте реализовать базовые методы, такие как расчет периметра фигур, в качестве дефолтных методов в интерфейсе.");
        System.out.println();
        // вывод информации о фигурах
        tr1.TriangleInfo();
        System.out.println();
        rect1.RectangleInfo();
        System.out.println();
        c1.CircleInfo();
    }
}
