/* Нужно написать программу, которая будет принимать от пользователя ввод различных логинов.
Как только пользователь введет пустую строку - программа должна прекратить приём данных от пользователя
и вывести в консоль логины, начинающиеся на букву f (строчную).*/
package by.aston.aqa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите логин: ");
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }
        list.stream().filter(s -> s.substring(0, 1).matches("f")).forEach(System.out::println);
    }
}
