package com.company;

import java.util.Scanner;

public class calcu {
    public void cal() {

            Double number1, number2, result;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter first number :");
            number1 = input.nextDouble();
            System.out.print("Enter second number :");
            number2 = input.nextDouble();

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

    }}
