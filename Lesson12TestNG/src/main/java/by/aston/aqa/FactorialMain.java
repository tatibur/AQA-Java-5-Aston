/* Создайте ветку Lesson_12_testng. Напишите программу, позволяющую вычислить факториал числа.
В ветке Lesson_12_testng  напишите юнит-тесты, используя TestNG. */
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