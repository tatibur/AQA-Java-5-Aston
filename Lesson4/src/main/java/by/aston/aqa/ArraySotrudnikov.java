package by.aston.aqa;

public class ArraySotrudnikov {
    public static void main(String[] args) {
        Sotrudnik[] sotrArray = new Sotrudnik[5];
        sotrArray[0] = new Sotrudnik("Ivanov Alexander", "Engineer", "Ivnv@mail.ru", "444578963", 1550, 23);
        sotrArray[1] = new Sotrudnik("Sidorov Sergei", "Developer", "Sdrv@mail.ru", "332569874", 3500, 38);
        sotrArray[2] = new Sotrudnik("Alekseev Aleksei", "Driver", "Alks@mail.ru", "295698745", 1000, 41);
        sotrArray[3] = new Sotrudnik("Petrova Ekaterina", "Secretary", "PtrvE@mail.ru", "442569878", 2750, 27);
        sotrArray[4] = new Sotrudnik("Eliseeva Natalia", "Accountant", "Elsv@mail.ru", "291158996", 4100, 51);
        // условие
        System.out.println("Создать массив из 5 сотрудников.");
        System.out.println();
        // вывод информации о сорудниках
        for (int i = 0; i < sotrArray.length; i++) {
            sotrArray[i].info();
        }
    }
}
