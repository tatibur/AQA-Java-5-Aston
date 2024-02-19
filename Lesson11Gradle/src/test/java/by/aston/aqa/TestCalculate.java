package by.aston.aqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculate {

    @Test
    void Sum() {

        double num1 = 3.5;
        double num2 = 2.0;
        double expectedValue = 5.5;

        double sum = Calculate.Add(num1, num2);

        Assertions.assertEquals(expectedValue, sum);
    }

}