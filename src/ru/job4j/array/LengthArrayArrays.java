package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{4}, {4, 3}, {4, 3, 2}, {4, 3, 2, 1}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + numbers[i].length
            );
        }
    }
}