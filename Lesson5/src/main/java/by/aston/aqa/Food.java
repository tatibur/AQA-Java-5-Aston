package by.aston.aqa;

public class Food {
    private int amount;

    public Food(int amount) {
        this.amount = amount;
    }

    // метод добавления еды в миску
    public void addFood(int amount) {
        this.amount = this.amount + amount;
    }

    // метод возвращает количество еды в миске
    public int getFood() {
        return this.amount;
    }

    // метод уменьшает количество еды в миске
    public void reduceFood(int amount) {
        this.amount = this.amount - amount;
    }
}
