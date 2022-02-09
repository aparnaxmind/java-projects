package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class trycalculator {
    public void cal() {
        try {
            int number1, number2, result;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter first number :");
            number1 = input.nextInt();
            System.out.print("Enter second number :");
            number2 = input.nextInt();
            if(number1 > 999 || number2 > 999) {
                throw new ArithmeticException("user entered number exceeds 999");
            }

            System.out.print("Enter the operator :MINUS, PRODUCT, DIVIDE, PLUS  : ");
            Operations opr = Operations.valueOf(input.next());
            switch (opr) {
                case PLUS:
                    result = number1 + number2;
                    System.out.println(number1 + " + " + number2 + " = " + result);
                    break;
                case MINUS:
                    result = number1 - number2;
                    System.out.println(number1 + " - " + number2 + " = " + result);
                    break;
                case PRODUCT:
                    result = number1 * number2;
                    System.out.println(number1 + " * " + number2 + " = " + result);
                    break;
                case DIVIDE:
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                    break;
            }
        } catch (ArithmeticException e1){
            System.out.println("occur an arithmetic exception :while dividing the numbers OR user entered number exceeds 999");
            System.out.println(e1.getMessage());
        }catch (InputMismatchException e){
            System.out.println(" the user given input is not a number");
       }

        finally {
            System.out.println(" program executed successfully ");
        }
    }}