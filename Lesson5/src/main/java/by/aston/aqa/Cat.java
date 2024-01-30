package by.aston.aqa;

class Cat extends Animal {
    private String name;
    private boolean satiety; //сытость

    // пустой конструктор класса Cat
    public Cat() {
    }

    // конструктор класса Cat
    public Cat(String name) {
        super(name);
        this.name = name;
        this.satiety = false;
    }

    // метод run
    @Override
    public void run(int lengthRun) {
        if (lengthRun <= 200) {
            System.out.print(" пробежал " + lengthRun + "м, ");
        } else {
            System.out.print(" устал бежать, ");
        }
    }

    // метод swim
    public String swim(String aWord) {
        return ("кот не умеет плавать");
    }

    // метод eat
    public String eat(int amount, Food food) {
        if (this.satiety) {
            return this.name + " сыт";
        }
        int gf = food.getFood();
        if (gf >= amount) {
            this.satiety = true;
            food.reduceFood(amount);
            return this.name + " наелся (cъел " + amount + ")";
        } else return this.name + " остался голодный";
    }
}

