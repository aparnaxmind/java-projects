package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.entity.Studentinfo;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){this.studentService=studentService;}

    @GetMapping("/student")
    public String getstudent(Model model) {
//        studentService.getStudents();
        model.addAttribute("liststudents",studentService.getStudents());
        return "student";

    }
}
