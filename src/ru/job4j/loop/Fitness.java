package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        if (ivan > nik) {
            return month;
        } else {
            while (ivan < nik * 2) {
                ivan *= 3;
                month = month + 1;
                }
        }
        return month;
    }
}
