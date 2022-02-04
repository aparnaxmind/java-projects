package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int num, integer, odd = 0, even = 0;
        System.out.print("Enter the number of integers: ");
        num = input.nextInt();
        System.out.print("Enter the integers:\n");
        for (int i = 0; i < num; i++) {
            integer = input.nextInt();
            if (integer % 2 == 0)
                even += integer;
            else
                odd += integer;  }
        System.out.print("Sum of Even Numbers: " + even);
        System.out.print("\nSum of Odd Numbers: " + odd);
    }
}
