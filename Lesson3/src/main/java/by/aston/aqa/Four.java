/* Написать метод, которому в качестве аргументов передается строка и число,
метод должен отпечатать в консоль указанную строку, указанное количество раз */
package by.aston.aqa;

public class Four {
    public static void Str(String s1, int a) {
        // вывод строки, указанное количество раз
        for (int i = 0; i < a; i++) {
            System.out.println(s1);
        }
    }
}

