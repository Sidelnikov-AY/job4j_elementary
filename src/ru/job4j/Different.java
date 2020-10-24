package ru.job4j;

public class Different {
    public static void main(String[] args) {
        long l = 129;
        byte b = (byte) l;
        System.out.println("1:" + b);

        float f = 12358.7f;
        int i = 45981;
        short rsl = (short) (f + i);
        System.out.println("2:" + rsl);

        char c = 45000;
        float m = c;
        System.out.println("3:" + m);

        double d = 121.19;
        byte g = (byte) d;
        System.out.println("4:" + g);

        short s = 1500;
        char q = (char) s;
        double v = q;
        System.out.println("5:" + v);

    }
}
