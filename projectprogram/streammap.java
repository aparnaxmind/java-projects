package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streammap {
    public void streamap() {

        // Creating a list of Integers
        List<Integer> number = Arrays.asList(2,3,4,5);
        List<String> list = Arrays.asList("abc","def","ghoi","jlekl","Mno","pqr","stu","vwxyz");

        System.out.println("The stream after applying the function multiple with 3 is : ");
        // using stream map function multiply all elements in an array by 3
        number.stream().map(numbers -> numbers * 3).forEach(System.out::println);
        // using stream map convert all elements in a string array to upper case
        System.out.println("The stream after applying the function uppercase to array is : ");
        List<String> answer = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(answer);
        // Using stream map find the length of all elements in the string array
        System.out.println("Using stream map find the length of all elements in the string array");
        list.stream().map(str -> str.length()).forEach(System.out::println);


    }
}
