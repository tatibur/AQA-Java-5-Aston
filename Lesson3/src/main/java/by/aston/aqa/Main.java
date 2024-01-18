package by.aston.aqa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        One rc = new One();

        //задание 1
        System.out.println(rc.Summa());
        //задание 2
        Two.Plus(0);
        //задание 3
        System.out.println(Three.Boll(0));
        //задание 4
        Four.Str("hello", 5);
        //задание 5
        System.out.println(Five.God());
        //задание 6
        Six.Mass();
        //задание 7
        Seven.Sto();
        // задание 8
        Eight.Double();
        // задание 9
        Nine.Diagonal(5);
        // задание 10
        System.out.println(Arrays.toString(Ten.Ret(7, 10)));
    }
}
