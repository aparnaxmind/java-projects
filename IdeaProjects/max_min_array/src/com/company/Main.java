package com.company;

public class Main {

    public static void main(String[] args) {
        int arry[] = {545, 243, -44, 0, 22, 45, 54, -9, 7};

        // assign first array element to two variables
        int max = arry[0];
        int min = arry[0];
        // iterate and compare from array index 1
        for(int i = 1; i < arry.length; i++){
            if(max < arry[i]){
                max = arry[i];
            }else if(min > arry[i]){
                min = arry[i];
            }
        }
        System.out.println(" Maximum number = " + max + "\n Minimum number = " + min);
    }
}
