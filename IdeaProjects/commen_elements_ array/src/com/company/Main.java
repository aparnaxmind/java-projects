package com.company;

public class Main {

    public static void main(String[] args) {
        // initialise array
        String[] Array1 = {"Java", "CPP","React.js", "Python"};
        String[] Array2 = {".Net", "React.js", "React.Native", "Java","Java Script", "Python"};
        // Outer loop
        for(int i = 0; i < Array1.length; i++){
            for(int j = 0; j < Array2.length; j++){// inner loop
                if(Array1[i].equals(Array2[j])){
                    System.out.println(Array1[i]);
                    break;
                }
            }
        }
    }
}
