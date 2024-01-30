package by.aston.aqa;

public interface InterfaceRectangle {
    // метод нахождения периметра прямоугольника
    default int perimeter(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public int square(int a, int b);
}
