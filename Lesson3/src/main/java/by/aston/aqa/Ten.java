/*Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив
типа int длиной len, каждая ячейка которого равна initialValue */
package by.aston.aqa;

public class Ten {
    public static int[] Ret(int len, int initialValue) {
        // объявление, создание массива
        int[] arr5 = new int[len];
        // инициализация и вывод массива
        for (int i = 0; i < len; i++) {
            arr5[i] = initialValue;
        }
        return arr5;
    }
}
