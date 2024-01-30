package by.aston.aqa;

public class Animal {
    private String name;
    public static int count = 0;

    // конструктор класса Animal
    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
        count++;
    }

    // метод подсчёта всех животных, котов и собак
    public static int getCount() {
        return count;
    }

    // метод вывода информации о животных
    public void animalInfo() {
        System.out.print(name);
    }

    // метод run
    public void run(int lengthRun) {
        System.out.print(" пробежал " + lengthRun + "м, ");
    }

    // метод swim
    public void swim(int lengthSwim) {
        System.out.println("проплыл " + lengthSwim + "м, ");
    }
}
