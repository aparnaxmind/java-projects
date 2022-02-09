
package com.company;

import java.util.Scanner;

public class Student {
    private String name;
    int rollno;
    String address;
    //int mark[];
    int mark[]=new int[5];

    // Getter
    public String showData() {
       System.out.println(rollno);
       System.out.println(name);
       System.out.println(address);
       //System.out.println(mark);
        for(int i = 0; i < 5; i++) {
            System.out.println(mark[i]);
        }

        return name;
    }

    // Setter
    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the rollno :");
        int no = sc.nextInt();

        String newName = sc.nextLine();
        System.out.print("Enter  the name:");
        String newname = sc.nextLine();

        System.out.print("Enter  the address :");
        String newaddress = sc.nextLine();

        System.out.print("Enter  the marks :");
        for(int i = 0; i < 5; i++) {
            int marks= Integer.parseInt(sc.next());
            mark[i]=marks;
        }


        this.rollno = no;
        this.name = newname;
        this.address = newaddress;
        this.mark = mark;
    }


}
