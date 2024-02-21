package by.aston.aqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    @Test
    @DisplayName("Тест1")
    public void Assert1() {
        Assertions.assertEquals(1, Factorial.getFactorial(1));
    }

    @Test
    @DisplayName("Тест2")
    public void Assert2() {
        Assertions.assertEquals(2, Factorial.getFactorial(2));
    }
}