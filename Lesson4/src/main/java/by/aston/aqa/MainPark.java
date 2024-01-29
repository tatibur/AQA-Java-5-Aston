package by.aston.aqa;

public class MainPark {
    public static void main(String[] args) {
        Park park = new Park("Парк Луначарского А.В.", 6);
        park.addAttr(0, "Горки", "9-18", 5);
        park.addAttr(1, "Карусель", "9-18", 4);
        park.addAttr(2, "Автодром", "9-18", 10);
        park.addAttr(3, "Батут", "9-18", 2);
        park.addAttr(4, "Американские горки", "9-18", 7);
        park.addAttr(5, "Колесо обозрения", "9-18", 15);
        // условие
        System.out.println("Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости");
        System.out.println();

        // вывод информации о парке и аттракционах
        park.infoPark();
    }
}
