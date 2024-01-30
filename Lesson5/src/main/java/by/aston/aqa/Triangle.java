package by.aston.aqa;

public class Triangle implements InterfaceTriangle {
    String colorFon;
    String colorGraniz;
    int a, b, c, h;

    // конструктор класса Triangle
    public Triangle(int a, int b, int c, int h, String colorFon, String colorGraniz) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
        this.colorFon = colorFon;
        this.colorGraniz = colorGraniz;
    }

    // метод нахождения площади треугольника
    public int square(int a, int h) {
        return a * h / 2;
    }

    // метод вывод информации о треугольнике
    public void TriangleInfo() {
        System.out.println("Периметр треугольника = " + perimeter(this.a, this.b, this.c));
        System.out.println("Площадь треугольника = " + square(this.a, this.h));
        System.out.println("Цвет заливки треугольника " + colorFon);
        System.out.println("Цвет границ треугольника " + colorGraniz);
    }

}
