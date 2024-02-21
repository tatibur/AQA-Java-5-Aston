package by.aston.aqa;

public class FactorialMain {
    public static void main(String[] args) {
        try {
            System.out.println(Factorial.getFactorial(5));
        } catch (FactorialException e) {
            System.out.println(e.getMessage());
        }
    }
}