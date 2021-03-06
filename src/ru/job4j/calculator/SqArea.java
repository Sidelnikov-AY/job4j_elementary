package ru.job4j.calculator;

public class SqArea {
    public static double square(int p, int k) {
        return k * Math.pow((p / (2 * (k + 1))), 2);
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 1, s = 2, real = " + result1);
    }
}
