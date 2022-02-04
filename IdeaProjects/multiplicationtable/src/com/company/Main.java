package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=0;
        System.out.print("Enter the number: ");
        num=sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(i +" x "+ num +" = "+num*i);
        }
    }
}
