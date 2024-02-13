/* Для любого набора случайно-сгенерированных чисел нужно определить количество чётных чисел. */
package by.aston.aqa;

public class Task_1 {
    public static void main(String[] args) {
        Generation array = new Generation();
        Expression func = (n) -> n % 2 == 0;
        System.out.println("Количество: " + count(array.getNums(10), func));

    }

    private static int count(int[] numbers, Expression func) {
        int result = 0;
        for (int i : numbers) {
            if (func.isEqual(i))
                result++;
        }
        return result;
    }
}
