package com.student.demo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.student.demo.dtos.StudentDetailsRequestDTO;
import com.student.demo.entity.Student;
import com.student.demo.service.StudentService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@WebMvcTest(controllers = {StudentController.class})
class StudentControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Mock
    private StudentService studentService;

    @Test
    @DisplayName("add new students")
    void registerNewStudent()throws Exception {
        Student student = new Student();
        student.setName("abhirami");
        student.setEmail("abhi@gmail.com");
        StudentDetailsRequestDTO studentDetailsRequestDTO=new StudentDetailsRequestDTO();
        studentDetailsRequestDTO.setName("abhirami");
        studentDetailsRequestDTO.setEmail("abhi@gmail.com");
//        StudentDetailsRequestDTO student= new StudentDetailsRequestDTO();
//        student.setName("Abhirami");
//        student.setEmail("vp@gmail.com");
        Mockito.when(studentService.addNewStudent(studentDetailsRequestDTO)).thenReturn(Optional.of(student));
        mockMvc.perform( MockMvcRequestBuilders
                        .post("/api/v1/student")
                        .content(new ObjectMapper().writeValueAsString(new Student(1L,
                                "Abhirami",
                                "Abhirami@gmail.com",
                                40)))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());
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

//        Student student = new Student();
//        student.setName("abhirami");
//        student.setEmail("abhi@gmail.com");
        StudentDetailsRequestDTO studentDetailsRequestDTO=new StudentDetailsRequestDTO();
        studentDetailsRequestDTO.setName("abhirami");
        studentDetailsRequestDTO.setEmail("abhi@gmail.com");


        Mockito.when(studentService.getStudents(1l)).thenReturn(Optional.of(student));
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/student"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect((MockMvcResultMatchers. jsonPath("$", Matchers.hasSize(1))))
                .andExpect((MockMvcResultMatchers.jsonPath("$[0].name", Matchers.equalTo("Abhirami"))));
    }
//    public Void registerNewStudent() throws Exception{
//        Student student=new Student();
//        student.setName("Abhirami");
//        student.setEmail("vp@gmail.com");
//
//
//        Mockito.when(studentService.addNewStudent(student)).thenReturn(student);
//        mockMvc.perform(MockMvcRequestBuilders
//                        .post("api/v1/student")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(new ObjectMapper().writeValueAsString(new Student()))
//                        .andExpect(MockMvcResultMatchers.status().isOk()));
//
//    }

//    @Test
//    @DisplayName("get students")
//    void getStudents() {



}