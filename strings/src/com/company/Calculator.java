


package com.company;

import java.util.Scanner;

public class Calculator {

    enum Operation {

        PLUS("+") {
            double apply(double x, double y) {
                return x + y;
            }
        },
        MINUS("-") {
            double apply(double x, double y) {
                return x - y;
            }
        },
        TIMES("*") {
            double apply(double x, double y) {
                return x * y;
            }
        },
        DIVIDE("/") {
            double apply(double x, double y) {
                return x / y;
            }
        };

        private final String symbol;

        Operation(String symbol) {
            this.symbol = symbol;
        }

        abstract double apply(double  number1, double  number2);
    }

    public static void calculate() {
        char operator;
        Double number1, number2, result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        number1 = input.nextDouble();
        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);
        System.out.println("Enter second number");
        number2 = input.nextDouble();


        for (Operation op : Operation.values()) {
            System.out.print( number1+ " ");
            System.out.print(op.toString() + " ");
            System.out.print(number2 + " = ");
            System.out.println(op.apply(number1, number2));

        }
    }

}




