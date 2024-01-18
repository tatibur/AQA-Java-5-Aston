/*Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2 */
package by.aston.aqa;

import java.util.Arrays;


public class Eight {
    public static void Double() {
        // объявление, создание, инициализация массива
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        // выполнение условия
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        // вывод массива
        System.out.println(Arrays.toString(arr3));
    }
}



