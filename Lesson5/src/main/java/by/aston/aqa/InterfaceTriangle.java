package by.aston.aqa;

public interface InterfaceTriangle {
    // метод нахождения периметра треугольника
    default int perimeter(int a, int b, int c) {
        return a + b + c;
    }

    public int square(int a, int h);
}
