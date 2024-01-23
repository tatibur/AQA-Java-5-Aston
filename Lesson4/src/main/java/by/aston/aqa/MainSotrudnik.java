package by.aston.aqa;

public class MainSotrudnik {
    public static void main(String[] args) {
        Sotrudnik sotrudnik = new Sotrudnik("Petrov Ivan", "Director", "Ptr@mail.ru",
                "291153749", 15000, 35);
        // условие
        System.out.println("Создать класс Сотрудник с полями: ФИО, должность, email, телефон, зарплата, возраст.");
        System.out.println("Конструктор класса должен заполнять эти поля при создании объекта.");
        System.out.println("Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.");
        System.out.println();
        // вывод информации о сотруднике
        sotrudnik.info();

    }
}
