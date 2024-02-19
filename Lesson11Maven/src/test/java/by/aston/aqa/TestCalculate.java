/* Создайте ветку Lesson_11_maven, в ней создайте проект, используя Maven с архетипом quickstart.
Добавьте зависимости на такие инструменты как JUnit 5, Selenium. */
package by.aston.aqa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCalculate {
    @Test
    void Sum() {
        double num1 = 3.5;
        double num2 = 2.0;
        double expectedValue = 5.5;

        double sum = Calculate.Add(num1, num2);

        assertEquals(expectedValue, sum);
    }
}