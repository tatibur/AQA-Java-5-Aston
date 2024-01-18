/*Написать метод, который определяет, является ли год високосным, и возвращает boolean
(високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го,
при этом каждый 400-й – високосный */
package by.aston.aqa;

import java.util.Scanner;

public class Five {
    public static boolean God() {
        Scanner scn = new Scanner(System.in);
        // ввод года
        System.out.print("Введите год: ");
        int g = scn.nextInt();
        // проверка условия
        return (g % 4 == 0 && g % 100 != 0 || g % 400 == 0);
    }
}
