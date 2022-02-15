package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class convertlistmap {
    public static void main(String[] args) {
        List<Student> studentsList=getListOfStudent();

        Map<String, Integer> StudentsMap = studentsList.stream()
                .collect(Collectors.toMap((s)->s.getName(), (s)->s.getAge()));
        System.out.println(StudentsMap);
    }

    public static List<Student> getListOfStudent()
    {
        List<Student> studentList=new ArrayList<>();

        Student m1=new Student("Student1",20);
        Student m2=new Student("Student1",21);
        Student m3=new Student("Student3",20);
        Student m4=new Student("Student4",20);
        Student m5=new Student("Student5",21);

        studentList.add(m1);
        studentList.add(m2);
        studentList.add(m3);
        studentList.add(m4);
        studentList.add(m5);

        System.out.println(studentList);
        return studentList;
    }
}

