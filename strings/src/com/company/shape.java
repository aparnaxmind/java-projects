package com.company;

import java.util.Scanner;

public class shape {
    public void shape() {
        System.out.println("1. Cube");              //user input
        System.out.println("2. Cuboid");
        System.out.println("3. Cone");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  your choice :");
        int choice = sc.nextInt();

        switch (choice)                      //actions based on choice
        {
            case 1:
                System.out.println("Enter value for side:");
                float side = sc.nextFloat();
                System.out.println("The volume of cube=");
                volume(side);
                break;


            case 2:
                System.out.println("Enter value of length:");
                float length = sc.nextFloat();

                System.out.println("Enter value of breadth");
                float breadth = sc.nextFloat();

                System.out.println("Enter value of height:");
                float height = sc.nextFloat();

                System.out.println("volume of cuboid is=");
                volume(length, breadth, height);
                break;


            case 3:

                System.out.println("Enter value for radius:");
                float radius = sc.nextFloat();

                System.out.println("Enter value of height:");
                float heights = sc.nextFloat();

                System.out.println("The volume of Sphere=");
                volume(radius, heights);
                break;

            default:
                System.out.println("Invalid Entry!");
        }
    }
    private void volume(float radius, float heights) {
        double v1= (1/3) * 3.14 * (radius *radius) * heights;
        System.out.print(v1);
    }

    private void volume(float length, float breadth, float height) {
        double v2 = (length*breadth*height );
        System.out.print(v2);
    }

    public void volume(Float side){
        double v3 = (side*side*side);
        System.out.print(v3);

    }
}
