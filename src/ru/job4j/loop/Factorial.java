package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
         if (n == 0) {
            result = 1;
        } else {
            for (int index = n; index > 0; index--) {
                result = result * index;
            }
        }
        return result;
    }
}
