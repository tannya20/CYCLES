package org.example;

public class Main {

public static void  main(String [] args){
    int count = 0;
    int count2 = 0;
    Calculate calculate = new Calculate();
    count  = calculate.calc(10000, 3000);

    System.out.println("Мы отдыхали "+ count +" раз");

    }

}