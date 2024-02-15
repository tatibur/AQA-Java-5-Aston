/*  1. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
    2. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    3. Для хранения фруктов внутри коробки можно использовать ArrayList;
    4. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
    5. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
    6. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
    7. Не забываем про метод добавления фрукта в коробку.*/
public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Box<Apple> box1 = new Box<>(apple1, apple2, apple3, apple4);
        Box<Orange> box2 = new Box<>(orange1, orange2);

        System.out.println("Коробки равны по массе: " + box1.compare(box2));
        System.out.println("Общий вес яблок: " + box1.getWeight());
        System.out.println("Общий вес апельсинов: " + box2.getWeight());

        Box<Orange> box3 = new Box<>();
        box2.transfer(box3);
    }
}
