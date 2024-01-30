package by.aston.aqa;

public class Rectangle implements InterfaceRectangle {
    String colorFon;
    String colorGraniz;
    int a, b, c, d;

    // конструктор класса Rectangle
    public Rectangle(int a, int b, int c, int d, String colorFon, String colorGraniz) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.colorFon = colorFon;
        this.colorGraniz = colorGraniz;
    }

    // метод нахождения площади прямоугольника
    public int square(int a, int b) {
        return a * b;
    }

    // метод вывода информации о прямоугольнике
    public void RectangleInfo() {
        System.out.println("Периметр прямоугольника = " + perimeter(this.a, this.b, this.c, this.d));
        System.out.println("Площадь прямоугольника = " + square(this.a, this.b));
        System.out.println("Цвет заливки прямоугольника " + colorFon);
        System.out.println("Цвет границ прямоугольника " + colorGraniz);
    }
}
