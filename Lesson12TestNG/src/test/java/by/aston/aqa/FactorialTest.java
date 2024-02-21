package by.aston.aqa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {
    @Test
    public void Assert1() {
        Assert.assertEquals(1, Factorial.getFactorial(1));
    }

    @Test
    public void Assert2() {
        Assert.assertEquals(2, Factorial.getFactorial(2));
    }
}
