package by.aston.aqa;

class Dog extends Animal {
    private String name;

    // конструктор класса Dog
    public Dog(String name) {
        super(name);
        this.name = name;
    }

    // метод run
    @Override
    public void run(int lengthRun) {
        if (lengthRun <= 500) {
            System.out.print(" пробежала " + lengthRun + "м, ");
        } else {
            System.out.print(" устала бежать, ");
        }
    }

    // метод swim
    public void swim(int lengthSwim) {
        if (lengthSwim <= 10) {
            System.out.println("проплыла " + lengthSwim + "м ");
        } else {
            System.out.println("устала плыть");
        }
    }
}

