package com.company;

import java.util.Scanner;

public class BankAccount {
    int accNumber;
    private static double balance;
    private static double interest;

    public void  currentBalance()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the accNumber :");
        int accNumber = sc.nextInt();
        System.out.print("Enter  the old balance :");
        int balance = sc.nextInt();
        System.out.print("Enter  the rate_of_interest :");
        int rate_of_interest = sc.nextInt();

        this.accNumber=accNumber;
        this.balance=balance;
        this.interest=rate_of_interest;
    }
    static class interest {
        public void calInterest() {
            balance = balance + balance * interest;
            System.out.print("your current balance is :");
            System.out.print(balance);
        }


    }
}