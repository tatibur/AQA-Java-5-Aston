package by.aston.aqa;

public class MainPark {
    public static void main(String[] args) {
        Park park = new Park(1, "Луначарского А.В.", "9-18");
        Park.Attractions attr1 = new Park.Attractions(1, "Горки", "9-18", 5);
        Park.Attractions attr2 = new Park.Attractions(2, "Карусель", "9-18", 4);
        Park.Attractions attr3 = new Park.Attractions(3, "Автодром", "9-18", 10);
        Park.Attractions attr4 = new Park.Attractions(4, "Батут", "9-18", 2);
        Park.Attractions attr5 = new Park.Attractions(5, "Американские горки", "9-18", 7);

        // условие
        System.out.println("Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости");
        System.out.println();
        // вывод информации о парке
        park.infoPark();

        // вывод информации об аттракционах
        attr1.infoAttr();
        attr2.infoAttr();
        attr3.infoAttr();
        attr4.infoAttr();
        attr5.infoAttr();
    }
}
