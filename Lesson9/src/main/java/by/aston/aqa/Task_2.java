/* Задана коллекция, состоящая из строк: «Highload», «High», «Load», «Highload». Нужно с ней выполнить следующие манипуляции:
1. Посчитать, сколько раз объект «High» встречается в коллекции;
2. Определить, какой элемент в коллекции находится на первом месте. Если мы получили пустую коллекцию, то пусть возвращается 0;
3. Необходимо вернуть последний элемент, если получили пустую коллекцию, то пусть возвращается 0. */
package by.aston.aqa;

import java.util.ArrayList;
import java.util.List;

public class Task_2 {
    public static void main(String[] args) {

        List<String> array = new ArrayList<>();
        array.add("Highload");
        array.add("High");
        array.add("Load");
        array.add("Highload");

        long count = array.stream()
                .filter(s -> s.equals("High"))
                .count();
        System.out.println("Объект High встречается " + count + " раз(а)");

        String firstPosition = array.stream()
                .findFirst()
                .orElse("0");
        System.out.println(firstPosition + " находится на первом месте");

        String lastPosition = array.stream()
                .reduce((a, b) -> b)
                .orElse("0");
        System.out.println(lastPosition + " находится на последнем месте");
    }
}
