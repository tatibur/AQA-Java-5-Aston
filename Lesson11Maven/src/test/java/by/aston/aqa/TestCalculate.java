/* Создайте ветку Lesson_11_maven, в ней создайте проект, используя Maven с архетипом quickstart.
Добавьте зависимости на такие инструменты как JUnit 5, Selenium. */
package by.aston.aqa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCalculate {
    @Test
    void Sum() {
       assertEquals(5.5, Calculate.Add(3.5, 2.0));
    }
}