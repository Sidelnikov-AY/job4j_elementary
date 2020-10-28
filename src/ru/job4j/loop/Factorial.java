package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        int factorial = 1;
        if (n == 0) {
            result = 1;
        } else {
            for (int index = n; index > 0; index--) {
                factorial = factorial * index;
                result = factorial;
            }
        }
        return result;
    }
}
