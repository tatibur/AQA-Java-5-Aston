package by.aston.aqa;

public class Circle implements InterfaceCircle {
    String colorFon;
    String colorGraniz;
    int r;
    static final float PI = 3.14f;

    //конструктор класса Krug
    public Circle(int r, String colorFon, String colorGraniz) {
        this.r = r;
        this.colorFon = colorFon;
        this.colorGraniz = colorGraniz;
    }

    //метод нахождения площади круга
    public float square(int r) {
        return PI * r * r;
    }

    //метод вывода информации о круге
    public void CircleInfo() {
        float p = perimeter(this.r);
        double scale = Math.pow(10, 2);
        double p1 = Math.ceil(p * scale) / scale;
        System.out.println("Периметр круга = " + p1);
        float pl = square(this.r);
        double scale1 = Math.pow(10, 2);
        double pl1 = Math.ceil(pl * scale1) / scale1;
        System.out.println("Площадь круга = " + pl1);
        System.out.println("Цвет заливки круга " + colorFon);
        System.out.println("Цвет границ круга " + colorGraniz);
    }
}
