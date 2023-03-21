package org.example;

import org.junit.Test;

    public class Calculate {
        public  int calc(int income, int exp){
            int count = 0;
            int money = 0;
            int threshold = 20000;
            for (int i = 1; i < 13; i++) {
                if (money >= threshold){
                    System.out.println("месец " + i + " денег "+ money + " -Буду отдыхать");
                    money = money - exp;
                    money = money - (8000);
                    count++;
                }else{
                    System.out.println("месец " + i + " Денег " + money + " -Работаем");
                    money = money + income;
                    money = money - exp;
                }

            }
            return count;
        }
    }