package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int moneyChange = money - price;
            for (int index = 0; index < COINS.length; index++) {
                while (moneyChange > 0 && moneyChange - COINS[index] >= 0) {
                    moneyChange -= COINS[index];
                    size++;
                    rsl[index] = COINS[index];
                    }
            }
        return Arrays.copyOf(rsl, size);
    }
}