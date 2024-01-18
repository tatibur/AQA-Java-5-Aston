/* Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false */
package by.aston.aqa;

import java.util.Scanner;

public class One {

    public boolean Summa() {
        Scanner scn = new Scanner(System.in);
        // ввод числа а
        System.out.print("Введите число a = ");
        int a = scn.nextInt();
        // ввод числа b
        System.out.print("Введите число b = ");
        int b = scn.nextInt();
        // проверка условия
        return a + b >= 10 && a + b <= 20;
    }
}

