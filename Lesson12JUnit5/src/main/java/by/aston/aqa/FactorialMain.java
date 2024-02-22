/* Создайте ветку Lesson_12_junit_5. Напишите программу, позволяющую вычислить факториал числа.
В ветке Lesson_12_junit_5 напишите юнит-тесты для этой программы, используя Junit 5. */
package by.aston.aqa;

public class FactorialMain {
    public static void main(String[] args) {
        try {
            System.out.println(Factorial.getFactorial(5));
        } catch (FactorialException e) {
            System.out.println(e.getMessage());
        }
    }
}