package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first > second ? first : second;
        result = result > third ? result : third;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(MultiMax.max(1, 2, 3));
        System.out.println(MultiMax.max(2, 2, 3));
        System.out.println(MultiMax.max(2, 2, 2));
    }
}
