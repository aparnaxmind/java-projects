package com.company;

import java.util.Scanner;

public abstract class Shapes {
    Scanner sc = new Scanner(System.in);
    public abstract float area();


    public static class Circle extends Shapes{

        @Override
        public float area() {
            System.out.println("enter the radius of circle");
            float a=sc.nextInt();
            double area_circle=(3.14*a*a);
            System.out.println("Radius of circle"+a);
            System.out.println("The area of circle is:"+area_circle);
            return 0;
        }
    }
    public static class Rectangle extends Shapes{

        @Override
        public float area() {
            System.out.println("enter the length and breadth of rectangle");
            float a=sc.nextInt();
            float b=sc.nextInt();
            float area_rect=a*b;
            System.out.println("Length of rectangle "+a +"breadth of rectangle "+b);
            System.out.println("The area of rectangle is:"+area_rect);
            return 0;
        }
    }
    public static class Square extends Shapes{

        @Override
        public float area() {
            System.out.println("enter the length of square");
            float a=sc.nextInt();
            float area_sqr=a*a;
            System.out.println("Length of square "+a );
            System.out.println("The area of square is:"+area_sqr);
            return 0;
        }
    }
    public static class Cube extends Shapes{

        @Override
        public float area() {
            System.out.print("Enter the length of edge of Cube : ");
            double a = sc.nextDouble();
            double Area = 6 * (a * a);
            System.out.println("The Surface Area of Cube is : " + Area);
            return 0;
        }
        public void volume(){
            System.out.print("Enter the length of edge of Cube : ");
            double a = sc.nextDouble();
            double volume = (a * a * a);
            System.out.println("The Volume of Cube is : " + volume);
        }
    }
    public static class Sphere extends Shapes{

        @Override
        public float area() {

            System.out.println("enter the radius of sphere");
            float a=sc.nextInt();
            double area_sphere= 4 * 3.14 * (a * a);
            System.out.println("Radius of sphere "+a);
            System.out.println("The area of sphere is:"+area_sphere);
            return 0;
        }
        public void volume(){
            System.out.println("enter the radius of sphere");
            float a=sc.nextInt();
            double volume = (4 / 3) * 3.14 * (a * a * a);
            System.out.println("volume of sphere  : " + volume);
        }
    }


}
