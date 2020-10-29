package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 1;
        double mortragePercent = 1 + percent / 100;
        while (amount * mortragePercent > salary)   {
            amount = amount - salary;
            year++;
        }
            return year;
    }
}