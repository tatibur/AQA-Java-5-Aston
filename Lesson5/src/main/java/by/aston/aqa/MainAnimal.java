package by.aston.aqa;

public class MainAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Дружок");
        Animal animal1 = new Animal("Барсик");
        Cat catBob = new Cat("Кот Боб");
        Cat catSnow = new Cat("Кот Снежок");
        Dog dogBobik = new Dog("Собака Бобик");
        Dog dogAlex = new Dog("Собака Алекс");
        Food food = new Food(20);
        Cat myLittleCat = new Cat();
        String catResponce;
        // массив котов
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Кот Тимофей");
        cats[1] = new Cat("Кот Матроскин");
        cats[2] = new Cat("Кот Белка");
        cats[3] = new Cat("Кот Василий");
        // условие
        System.out.println("Создать классы Собака и Кот с наследованием от класса Животное.");
        System.out.println("Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.'");
        System.out.println("У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).");
        System.out.println("Добавить подсчет созданных котов, собак и животных.");
        System.out.println("Расширить задачу, добавив для котов возможность кушать из миски, выполнив следующие пункты: ");
        System.out.println("Сделать так, чтобы в миске с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).");
        System.out.println("Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.");
        System.out.println("Считаем, что если коту мало еды в миске, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).");
        System.out.println("Создать массив котов и миску с едой, попросить всех котов покушать из этой миски и потом вывести информацию о сытости котов в консоль.");
        System.out.println("Добавить метод, с помощью которого можно было бы добавлять еду в миску. ");
        System.out.println();
        // информация про животных
        animal.animalInfo();
        animal.run(150);
        animal.swim(50);

        animal1.animalInfo();
        animal1.run(150);
        animal1.swim(50);
        // информация про котов
        catBob.animalInfo();
        catBob.run(30);
        catResponce = myLittleCat.swim("Hello");
        System.out.println(catResponce);

        catSnow.animalInfo();
        catSnow.run(1);
        catResponce = myLittleCat.swim("Hello");
        System.out.println(catResponce);
        // информация про собак
        dogBobik.animalInfo();
        dogBobik.run(501);
        dogBobik.swim(5);

        dogAlex.animalInfo();
        dogAlex.run(150);
        dogAlex.swim(25);
        System.out.println();
        // кормление котов
        food.addFood(100);
        System.out.println("Еды в миске: " + food.getFood());
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].eat(10, food));
        }
        System.out.println("Еды в миске: " + food.getFood());
        System.out.println();
        // информация про количество животных, котов, собак
        System.out.println("Всего животных: " + Animal.getCount());
    }
}
