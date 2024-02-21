package by.aston.aqa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {
    @Test
    public void Assert1() throws FactorialException {
        Assert.assertEquals(1, Factorial.getFactorial(1));
    }

    @Test
    public void Assert2() throws FactorialException {
        Assert.assertEquals(2, Factorial.getFactorial(2));
    }

    @Test(expectedExceptions = FactorialException.class)
    public void Assert3() throws FactorialException {
        Factorial.getFactorial(-1);
    }

    @Test
    public void Assert4() throws FactorialException {
        Assert.assertEquals(1, Factorial.getFactorial(0));
    }
}
