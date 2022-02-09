package com.company;

import javax.print.attribute.standard.MediaSizeName;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    int rollno;
    int id;
    String name;
    int age;
    String grade;
    public void  registerForScholorship(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter roll number :");
        rollno = input.nextInt();
        System.out.print("Enter id number :");
        id = input.nextInt();
        System.out.print("Enter your name :");
        name = input.next();
        System.out.print("Enter your age :");
        age = input.nextInt();
        System.out.print("Enter your grade :");
        grade = input.next();
        try{

            List aList = new ArrayList();
            aList.add("D");
            aList.add("E");
            aList.add("F");
            aList.add("d");
            aList.add("e");
            aList.add("f");
            if(age < 10 ) {
                throw new Exception(" your age is lessthan 10 !!!");
            }
            if (aList.contains(grade)) {
                throw new Exception(" your mark is less !!!");

            }
        } catch (Exception e) {
            System.out.print("throw an exception @");
            System.out.println(e.getMessage());
        }
    }


    }

