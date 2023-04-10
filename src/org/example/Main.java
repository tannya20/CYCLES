package org.example;

public class Main {

    public static void main(String[] args) {
        int count;
        org.example.Calculate calculate = new org.example.Calculate();
        count = calculate.calc(10000, 3000, 20_000);
        System.out.println("Мы отдыхали " + count + " раз");

        System.out.println("====================");

        count = calculate.calc(100_000, 60_000, 150_000);
        System.out.println("Мы отдыхали " + count + " раз");
    }

}