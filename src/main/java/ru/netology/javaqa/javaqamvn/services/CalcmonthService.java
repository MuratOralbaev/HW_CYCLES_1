package ru.netology.javaqa.javaqamvn.services;

public class CalcmonthService {
    public int calculate(int income, int expence, int treshold) {
        int count = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= treshold) {
                money = (treshold - expence) / 3;
                count++;
            } else {
                money = (money + income) - expence;
            }
        }
        return count;
    }
}
