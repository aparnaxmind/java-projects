package com.company;

import java.util.Scanner;

import static com.company.CoffeeSelection.*;

public class CoffeeMakingMachine {
    public void coffee() {
        Scanner input = new Scanner(System.in);


        System.out.print(" CoffeeSelection ( FILTER_COFFEE,ESPRESSO,CAPPUCCINO): ");
        CoffeeSelection coffeeSelection=CoffeeSelection.valueOf(input.next());
        System.out.print("how many cup of coffee do you want ? :");
        int no_cup = input.nextInt();

        if (no_cup==1){

            brewCoffee(coffeeSelection);
        }
        else {
            brewCoffee(coffeeSelection,no_cup);
        }
    }

    private void brewCoffee(CoffeeSelection coffeeSelection) {
        System.out.print(coffeeSelection);
        System.out.print(" is ready ");
    }

    private void brewCoffee(CoffeeSelection coffeeSelection, int no_cup) {
        System.out.print(no_cup );
        System.out.print(" cup of ");
        System.out.print(coffeeSelection);
        System.out.print(" is ready");
    }
}
