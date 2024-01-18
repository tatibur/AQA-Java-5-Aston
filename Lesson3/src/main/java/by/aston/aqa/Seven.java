/* Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100 */
package by.aston.aqa;

import java.util.Arrays;

public class Seven {
    public static void Sto() {
        // объявление, создание массива
        int[] arr2 = new int[100];
        // инициализация массива
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        // вывод массива
        System.out.println(Arrays.toString(arr2));
    }
}

