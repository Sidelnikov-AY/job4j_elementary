package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int calc = 0;
        for (int index = 0; index < hours.length; index++) {
            //проверяем рабочие дни
            if (index < 5) {
                //проверяем рабочее время
                if (hours[index] < 9) {
                    calc += hours[index] * 10;
                }
                // проверяем нерабочее время
                else if (hours[index] > 8) {

                    calc += (8 * 10) + (hours[index] - 8) * 15;
                }
            }
            // проверяем выходные - рабочее время
            else if (hours[index] < 9) {
                calc += hours[index] * 10 * 2;
            }
            // проверяем выходные - нерабочее время
            else {
                calc += (8 * 10 * 2) + (hours[index] - 8) * 15 * 2;
            }
        }
        return calc;
    }
}