package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            /* swap(...) */
            int temp = data[i];
            data[i] = min;
            data[index] = temp;
         }
        return data;
    }

    public static void main(String[] args) {
        int[] data = new int[] {3, 2, 1, 9, 5, 8, 0, 7, 4, 6};
        sort(data);
        for (int number : data) {
            System.out.println(number);
        }
    }
}