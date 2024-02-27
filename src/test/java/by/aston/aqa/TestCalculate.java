/* Создайте ветку Lesson_11_gradle, в ней создайте проект, используя Gradle.
В каждый проект добавьте зависимости на такие инструменты как JUnit 5, Selenium.*/
package by.aston.aqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculate {

    @Test
    void Sum() {
        Assertions.assertEquals(5.5, Calculate.Add(3.5, 2.0));
    }
}