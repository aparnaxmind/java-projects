package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double number1; int num1; double num2;
        int number2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter doble number :");
        number1 = input.nextDouble();
        System.out.print("Enter integer number :");
        num1 = input.nextInt();
        num2 = (double) num1;
        number2 = (int)number1;
        System.out.println("your integer number of "+ number1 + " is " + number2);
        System.out.println("your double number of "+ num1 + " is " + num2);

    }
}
