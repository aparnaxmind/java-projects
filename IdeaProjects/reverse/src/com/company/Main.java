package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int rev = 0;
        int rem = 0;
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter an integer : ");
        int num = myObj.nextInt();
        int temp = num;
        while(temp>0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        System.out.println("Reverse of " + num + " is " + rev);
    }
}
