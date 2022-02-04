package com.company;

public class Main {

    public static void main(String[] args) {
        double[] numArray = { 456.35, 679.58, -405.16, 208.34, 330.09, 450.66 };
        double sum = 0.0;

        for (double num: numArray) {
            sum += num;
        }

        double average = sum / numArray.length;
        System.out.format("The average : %.2f", average);

    }
}
