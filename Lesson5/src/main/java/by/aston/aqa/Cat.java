package by.aston.aqa;

class Cat extends Animal {
    static int catCount;
    private boolean satiety; //сытость

    public Cat(String name) {
        super(name);
        this.name = name;
        satiety = false;
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    public void swim(int lengthSwim, int maxSwim) {
        System.out.println("не умеет плавать;");
    }

    public String eat(int amount, Food food) {
        if (satiety) {
            return name + " сыт";
        }
        if (food.getFood() >= amount) {
            satiety = true;
            food.reduceFood(amount);
            return name + " наелся (cъел " + amount + ")";
        } else return name + " остался голодный";
    }
}
