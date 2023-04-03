package org.example;

public class Main {

    public static void main(String[] args) {
        int count;
        //int count2 = 0;
        org.example.Calculate calculate = new org.example.Calculate();
        count = calculate.calc(10000, 3000);

        System.out.println("Мы отдыхали " + count + " раз");

    }

}