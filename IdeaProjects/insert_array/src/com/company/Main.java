package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i, element;
        int[] arr = new int[50];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Array Elements: ");
        for(i=0; i<10; i++)
            arr[i] = scan.nextInt();

        System.out.print("Enter index of  Element to Insert: ");
        int j = scan.nextInt();
        System.out.print("Enter an Element to Insert: ");
        element = scan.nextInt();
        arr[j] = element;

        System.out.println("\nNow the new array is: ");
        for(int k=0; k<i; k++)
            System.out.print(arr[k]+ " ");
    }
}
