package by.aston.aqa;

public class Park {
    int parkId;
    String parkName;
    String parkWorkHours;

    // создание конструктора класса Park
    public Park(int parkId, String parkName, String parkWorkHours) {
        this.parkId = parkId;
        this.parkName = parkName;
        this.parkWorkHours = parkWorkHours;
    }

    // внутренний класс
    public static class Attractions {
        int attrId;
        String attrName;
        String attrWorkHours;
        int attrCost;

        // создание конструктора внутреннего класса Attractions
        public Attractions(int attrId, String attrName, String attrWorkHours, int attrCost) {
            this.attrId = attrId;
            this.attrName = attrName;
            this.attrWorkHours = attrWorkHours;
            this.attrCost = attrCost;
        }

        // метод вывода информации об аттракционах
        public void infoAttr() {
            System.out.println("Номер аттракциона: " + attrId);
            System.out.println("Название аттракциона: " + attrName);
            System.out.println("Время работы аттракциона: " + attrWorkHours);
            System.out.println("Стоимость аттракциона: " + attrCost);
            System.out.println();
        }
    }

    // метод вывода информации о парке
    public void infoPark() {
        System.out.println("Номер парка: " + parkId);
        System.out.println("Название парка: " + parkName);
        System.out.println("Время работы парка: " + parkWorkHours);
        System.out.println();
    }
}

