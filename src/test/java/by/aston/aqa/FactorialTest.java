package by.aston.aqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    public void Test1() throws FactorialException {
        Assertions.assertEquals(2, Factorial.getFactorial(2));
    }

    @Test
    public void Test2() throws FactorialException {
        Assertions.assertEquals(1, Factorial.getFactorial(0));
    }

    @Test
    public void Test3() {
        boolean exceptionThrown = false;
        try {
            Factorial.getFactorial(-1);
        } catch (FactorialException e) {
            exceptionThrown = true;
        }
        Assertions.assertTrue(exceptionThrown);
    }
}
