package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i, j;
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];

        Scanner s = new Scanner(System.in);
        /** get elements for array **/
        System.out.println("Enter 9 elements for first matrix: ");
        for(i=0; i<3; i++)
        {
            for(j=0; j<3; j++)
                a[i][j] = s.nextInt();
        }

        System.out.println("Enter 9 elements for second matrix: ");
        for(i=0; i<3; i++)
        {
            for(j=0; j<3; j++)
            {
                b[i][j] = s.nextInt();
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        /** print the array and result **/
        System.out.println(a[0][0] + " " + a[0][1] + " " + a[0][2] + "     " + b[0][0] + " " + b[0][1] + " " + b[0][2] +"\n" +
                        a[1][0] + " " + a[1][1] + " " + a[1][2] + "  +  " + b[1][0] + " " + b[1][1] + " " + b[1][2] +"\n" +
                        a[2][0] + " " + a[2][1] + " " + a[2][2] + "     " + b[2][0] + " " + b[2][1] + " " + b[2][2] +"\n"
                );
        System.out.println("\n sum =");
        for(i=0; i<3; i++)
        {
            for(j=0; j<3; j++)
                System.out.print(c[i][j]+ " ");
            System.out.print("\n");
        }
    }
}
