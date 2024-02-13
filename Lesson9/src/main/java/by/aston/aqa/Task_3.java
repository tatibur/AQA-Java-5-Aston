/* Задана коллекция, содержащая элементы "f10", "f15", "f2", "f4", "f4".
Необходимо отсортировать строки по возрастанию и добавить их в массив. */
package by.aston.aqa;

import java.util.ArrayList;
import java.util.List;

public class Task_3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("f10");
        list.add("f15");
        list.add("f2");
        list.add("f4");
        list.add("f4");

        list.sort((o1, o2) -> Integer.valueOf(o1.replaceAll("f", ""))
                .compareTo(new Integer(o2.replaceAll("f", ""))));
        String[] arr = new String[list.size()];
        list.toArray(arr);
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
