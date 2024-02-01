package by.aston.aqa;

public class Animal {
    String name;
    public static int count = 0;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void animalInfo() {
        System.out.print(name);
    }

    public void run(int lengthRun, int maxRun) {
        if (lengthRun < maxRun) {
            System.out.print(" пробежал " + lengthRun + "м, ");
        } else {
            System.out.print(" не может столько бежать, ");
        }
    }

    public void swim(int lengthSwim, int maxSwim) {
        if (lengthSwim < maxSwim) {
            System.out.println("проплыл " + lengthSwim + "м; ");
        } else {
            System.out.println("не может столько плыть.");
        }
    }
}