package com.example.demo.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Studentinfo {
    private String name;
    private String email;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                " name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age='" + age + '\'' +


                '}';
    }

}