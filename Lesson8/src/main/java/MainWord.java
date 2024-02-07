/*Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать, сколько раз встречается каждое слово. (реализовать с использованием коллекций)*/

import java.util.*;
import java.util.ArrayList;

public class MainWord {
    public static void main(String[] args) {
        List<String> word = new ArrayList<>();
        word.add("A");
        word.add("B");
        word.add("C");
        word.add("D");
        word.add("E");
        word.add("F");
        word.add("J");
        word.add("J");
        word.add("H");
        word.add("A");
        word.add("F");
        word.add("H");
        word.add("C");
        word.add("K");
        word.add("L");
        word.add("P");

        System.out.println(word);

        // Выводим уникальные слова
        Set<String> set = new HashSet<>(word);
        System.out.println(set);

        // Считаем, сколько раз встречается каждое слово
        for (String s : set) {
            System.out.println(s + ": " + Collections.frequency(word, s));
        }
    }
}
