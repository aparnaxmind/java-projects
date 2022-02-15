package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.company.studentsPredicates.*;

public class Studentmap {
    public static void main(String[] args) {
        List<Students> studentsList = getListOfStudents();

//        Map<Integer, String> StudentsMap = studentsList.stream()
//                .collect(Collectors.toMap((s)->s.getroll_no(),(s)->s.getName(), (s) -> s.getgender(), (s) -> s.getclas(), (s) -> s.getgrade()));
//        System.out.println(StudentsMap);
    }

    public static List<Students> getListOfStudents() {
        List<Students> studentsList = new ArrayList<>();

        Students m1 = new Students(1, "student1", "F", 10, "A Plus");
        Students m2 = new Students(2, "student2", "M", 9, "A ");
        Students m3 = new Students(3, "student3", "F", 8, "B Plus");
        Students m4 = new Students(4, "student4", "M", 10, "B");
        Students m5 = new Students(5, "student5", "F", 7, "C Plus");

        studentsList.add(m1);
        studentsList.add(m2);
        studentsList.add(m3);
        studentsList.add(m4);
        studentsList.add(m5);

        System.out.println( filterStudents(studentsList, isFemale()) );
        System.out.println( filterStudents(studentsList, ispass()) );
        System.out.println(studentsList);
        return studentsList;


    }
}


