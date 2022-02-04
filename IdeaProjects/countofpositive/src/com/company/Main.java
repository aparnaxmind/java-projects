package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input= new Scanner(System.in);
        int num, data;
        int zero = 0;
        int negative=0;
        int positive =0;
        System.out.print("Enter the number of integers: ");
        num = input.nextInt();
        System.out.print("Enter the integers:\n");
        for (int i = 0; i < num; i++) {
            data = input.nextInt();
            if (data < 0){
                negative++;
            }else if (data > 0){
                positive++;
            }
            else {
                zero++;
            }
        }
        System.out.println(positive + " positive numbers");
        System.out.println(negative + " negative numbers");
        System.out.println(zero + " zeros");
    }
}
