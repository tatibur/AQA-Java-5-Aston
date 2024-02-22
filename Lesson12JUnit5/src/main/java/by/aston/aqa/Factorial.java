package by.aston.aqa;

public class Factorial {
    public static long getFactorial(int n) throws FactorialException {
        if (n == 1 || n == 0) {
            return 1;
        } else if (n > 1) {
            return n * getFactorial(n - 1);
        } else {
            throw new FactorialException("Число меньше 0");
        }
    }
}
