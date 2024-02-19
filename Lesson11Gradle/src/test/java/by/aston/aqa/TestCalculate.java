/* Создайте ветку Lesson_11_gradle, в ней создайте проект, используя Gradle.
В каждый проект добавьте зависимости на такие инструменты как JUnit 5, Selenium.*/
package by.aston.aqa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculate {

    @Test
    void Sum() {
        assertEquals(5.5, Calculate.Add(3.5, 2.0));
    }

}