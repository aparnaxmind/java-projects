package com.company;

import java.util.StringJoiner;

public class suprifix {
    public void prisufix (){
        StringJoiner stringJoiner1 = new StringJoiner("-", "hai , ", " !!!")
            .add("user")
            .add("welcome")
            .add("back");
        System.out.println(stringJoiner1.toString());
}}
