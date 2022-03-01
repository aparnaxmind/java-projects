package com.demo.SpringBootTest.controllers;

import com.demo.SpringBootTest.entity.Student;
import com.demo.SpringBootTest.service.StudentService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.MockMvcAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(StudentController.class)
class StudentControllerTest {
    @MockBean
    StudentService studentService;
    @Autowired
    private MockMvc mockMvc;



    @Test
    @DisplayName("add new student")
    void registerNewStudent()throws Exception {
        Student student=new Student();
        student.setName("Abhirami");
        student.setEmail("vp@gmail.com");

        Mockito.when(studentService.addNewStudent(student)).thenReturn(student);
        mockMvc.perform( MockMvcRequestBuilders
                        .post("/api/v1/student")
                        .content(new ObjectMapper().writeValueAsString(new Student(1L,
                                "Abhirami",
                                "Abhirami@gmail.com",
                                40)))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }


    @Test
    @DisplayName("get students")
    void getStudents() throws Exception{
        List<Student> students = new ArrayList<>();
        Student student = new Student();
        student.setId(1L);
        student.setName("Abhirami");
        student.setEmail("abhirami@gmail.com");
        students.add(student);
        Mockito.when(studentService.getStudents()).thenReturn(students);
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/student"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect((MockMvcResultMatchers. jsonPath("$", Matchers.hasSize(1))))
                .andExpect((MockMvcResultMatchers.jsonPath("$[0].name", Matchers.equalTo("Abhirami"))));
    }

}