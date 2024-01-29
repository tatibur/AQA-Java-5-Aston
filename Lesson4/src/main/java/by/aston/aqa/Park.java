package by.aston.aqa;

public class Park {
    private String parkName;
    private int attrCount;
    private Attractions[] attractions;

    // создание конструктора класса Park
    public Park(String parkName, int attrCount) {
        this.parkName = parkName;
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
        System.out.println(parkName);
        System.out.println();
        for (int i = 0; i < this.attractions.length; i++) {
            if (this.attractions[i] != null) this.attractions[i].infoAttr();
        }
    }

    // метод добавления аттракциона в парк
    public void addAttr(int attrId, String attrName, String attrWorkHours, int attrCost) {
        if (attrId < attrCount) {
            this.attractions[attrId] = new Park.Attractions(attrId, attrName, attrWorkHours, attrCost);
        } else {
            System.out.println("Нельзя добавить аттракцион");
        }
    }
}