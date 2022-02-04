package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number = 0;
        int check, rem, sum = 0;
        System.out.print("Enter the number :");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        check = number;
        while(check != 0) {
            rem = check % 10;
            sum = sum + (rem * rem * rem);
            check = check / 10;
        }
        if(sum == number)
            System.out.println("Given number is an armstrong number.");
        else
            System.out.println("Given number is not an armstrong number.");
    }
}
