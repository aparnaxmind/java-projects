package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i,m=0,flag=0;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter number :");
        int num = myObj.nextInt();
        m=num/2;
        if(num==0||num==1) {
            System.out.println(num + " is not a prime number.");
        }
        else if (num==2){
            System.out.println(num+" is a prime number.");
        }
        else{
                for(i=2;i<=m;i++){
                    if(num%i==0){
                        System.out.println(num+" is not a prime number.");
                        flag=1;
                        break;
                    }
                }
                if(flag==0) { System.out.println(num+" is a prime number."); }
            }
        }
    }

