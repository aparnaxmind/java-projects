package com.company;

import java.util.Scanner;

public class Main {
    static  int fact(int n){
        if (n == 0)
            return 1;
        return  n * fact(n-1);
    }
    public static void main(String[] args) {
	// write your code here

        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter number ");
        int num = myObj.nextInt();

        System.out.println("factorial of "+ num + " is " +fact(num));
    }
}
