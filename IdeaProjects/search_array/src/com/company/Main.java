package com.company;

import java.util.Scanner;

public class Main {
    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the search value :");
        int num = sc.nextInt();
        System.out.println(contains(my_array1, num));
    }
}
