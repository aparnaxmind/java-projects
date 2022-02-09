package com.company;

import java.util.Scanner;

public class Employee {
        int id;
        String name;
        String address;
    Scanner sc = new Scanner(System.in);
        public int salary(){
            int salary;
            return salary=0;}
        public float workingHour(){
            float workingHour;
            return workingHour=0;}


    public static class JuniorDeveloper extends Employee{

            public int salary(){
                System.out.println("Enter junior developer salary :");
                int salary = sc.nextInt();
                System.out.println(" junior developer salary :" + salary);
                return salary;
                 }
            public float workingHour(){
                System.out.println("Enter junior developer  working hours :");
                float workingHour = sc.nextInt();
                System.out.println(" junior developer working hours :" + workingHour);
                return workingHour=0;}

        }


    public static class TeamLeader extends Employee{
        public int salary(){
            System.out.println("Enter  TeamLeader salary :");
            int salary = sc.nextInt();
            System.out.println("  TeamLeader salary :" + salary);
            return salary;
        }
        public float workingHour(){
            System.out.println("Enter  TeamLeader  working hours :");
            float workingHour = sc.nextInt();
            System.out.println("  TeamLeader working hours :" + workingHour);
            return workingHour=0;}

    }
    public static class ProjectManager extends Employee{
        public int salary(){
            System.out.println("Enter ProjectManager salary :");
            int salary = sc.nextInt();
            System.out.println(" ProjectManager salary :" + salary);
            return salary;
        }
        public float workingHour(){
            System.out.println("Enter ProjectManager  working hours :");
            float workingHour = sc.nextInt();
            System.out.println(" ProjectManager working hours :" + workingHour);
            return workingHour=0;}

    }
}
