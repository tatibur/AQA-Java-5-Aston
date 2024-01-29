package by.aston.aqa;

public class Park {
    private int parkId;
    private String parkName;
    private String parkWorkHours;
    private int attrCount;
    private Attractions[] attractions;

    // создание конструктора класса Park
    public Park(int parkId, String parkName, String parkWorkHours, int attrCount) {
        this.parkId = parkId;
        this.parkName = parkName;
        this.parkWorkHours = parkWorkHours;
        this.attrCount = attrCount;
        this.attractions = new Attractions[attrCount];
    }

    // внутренний класс
    public static class Attractions {
        private int attrId;
        private String attrName;
        private String attrWorkHours;
        private int attrCost;

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
        for (int i = 0; i < this.attractions.length; i++) {
            if (this.attractions[i] != null) this.attractions[i].infoAttr();
        }
    }

    // метод добавления аттракциона в парк
    public void addAttr(int id, String attrName, String attrWorkHours, int attrCost) {
        if (id < attrCount) {
            this.attractions[id] = new Park.Attractions(id, attrName, attrWorkHours, attrCost);
        } else {
            System.out.println("Нельзя добавить аттракцион");
        }
    }
}