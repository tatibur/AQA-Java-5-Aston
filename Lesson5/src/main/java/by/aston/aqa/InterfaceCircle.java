package by.aston.aqa;

public interface InterfaceCircle {
    static final float PI = 3.14f;

    // метод нахождения периметра круга
    default float perimeter(int r) {
        return 2 * PI * r;
    }

    public float square(int r);
}
