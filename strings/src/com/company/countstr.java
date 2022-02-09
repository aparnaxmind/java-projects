package com.company;

import java.util.Scanner;

public class countstr {
    public void strcount() {
        //String str = "9as78";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the string :");
        String str = sc.nextLine();
        int count = 0;
        int num = 0;
        int space = 0;
        int other = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))
                count++;
            else if(Character.isDigit(str.charAt(i))){
                num++ ;
            }
            else if(Character.isSpaceChar(str.charAt(i))){
                space++ ;
            }
            else{
                other++;
            }
        }
        System.out.println("String: "+str);
        System.out.println("Letters: "+count);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + other);

    }
}
