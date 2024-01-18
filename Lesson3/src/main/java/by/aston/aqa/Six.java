/*Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 С помощью цикла и условия заменить 0 на 1, 1 на 0 */
package by.aston.aqa;

import java.util.Arrays;

public class Six {
    public static void Mass() {
        // объявление, создание, инициализация массива
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        // замена 1 на 0 и 0 на 1
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (arr1[i] == 1) ? 0 : 1;
        }
        // вывод массива
        System.out.println(Arrays.toString(arr1));
    }
}

