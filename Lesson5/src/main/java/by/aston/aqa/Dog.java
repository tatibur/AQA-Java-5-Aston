package by.aston.aqa;

class Dog extends Animal {
    static int dogCount;

    public Dog(String name) {
        super(name);
        this.name = name;
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }
}

