package by.aston.aqa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

    @Test
    public void Test1() throws FactorialException {
        Assert.assertEquals(2, Factorial.getFactorial(2));
    }

    @Test
    public void Test2() throws FactorialException {
        Assert.assertEquals(1, Factorial.getFactorial(0));
    }

    @Test(expectedExceptions = FactorialException.class)
    public void Test3() throws FactorialException {
        Factorial.getFactorial(-1);
    }
}
