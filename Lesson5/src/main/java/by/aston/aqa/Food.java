package by.aston.aqa;

public class Food {
    private int amount;

    public Food(int amount) {
        this.amount = amount;
    }

    public void addFood(int amount) {
        this.amount = this.amount + amount;
    }

    public int getFood() {
        return this.amount;
    }

    public void reduceFood(int amount) {
        this.amount = this.amount - amount;
    }
}
