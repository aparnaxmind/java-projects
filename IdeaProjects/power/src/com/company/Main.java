package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int num1 = myObj.nextInt();
        System.out.print("Enter your second number : ");
        int num2 = myObj.nextInt();
        long temp = 1;

        for (;num2 != 0; --num2) {
            temp *= num1;
        }
        System.out.print("the power  = " + temp );
    }
}
