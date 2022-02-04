package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /**  Array declarations **/
        int[] my_array1 = {1234,2341,12354,987,765,1298,678};
        String[] my_array2 = { "aab","akd","pxz","rqs","mnj","jql"};

        /**  print  array**/
        System.out.println("Original numeric array : "+Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));

        System.out.println("Original string array : "+Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted string array : "+Arrays.toString(my_array2));
    }
}
