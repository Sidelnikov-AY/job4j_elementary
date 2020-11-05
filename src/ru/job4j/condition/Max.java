package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int third) {
        int result = third > max(left, right) ? third : max(left, right);
        return result;
    }

    public static int max(int left, int right, int third, int fourth) {
        int result = fourth > max(left, right, third) ? fourth : max(left, right, third);
        return result;
    }

    public static void main(String[] args) {
        int result = Max.max(10, 9, 9, 8);
        System.out.println(result);
    }
}
