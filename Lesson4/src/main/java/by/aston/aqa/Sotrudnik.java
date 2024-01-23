package by.aston.aqa;

public class Sotrudnik {
    String name;
    String position;
    String email;
    String number_tel;
    int salary;
    int age;

    // конструктор класса Sotrudnik
    public Sotrudnik(String name, String position, String email, String number_tel, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.number_tel = number_tel;
        this.salary = salary;
        this.age = age;
    }

    // метод вывода иформации в консоль
    public void info() {
        System.out.println("ФИО: " + name);
        System.out.println("Должность: " + position);
        System.out.println("email: " + email);
        System.out.println("Номер телефона: " + number_tel);
        System.out.println("Заработная плата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }
}

