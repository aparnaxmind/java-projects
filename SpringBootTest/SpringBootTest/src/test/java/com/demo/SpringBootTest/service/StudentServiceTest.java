package com.demo.SpringBootTest.service;

import com.demo.SpringBootTest.controllers.StudentController;
import com.demo.SpringBootTest.entity.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//class StudentServiceTest {
//    @Autowired
//    private MockMvc mockMvc;
//    @MockBean
//    StudentController studentController;
//
//    @Test
//    void addNewStudent()throws Exception {
//        Student student=new Student();
//        student.setName("Abhirami");
//        student.setEmail("vp@gmail.com");
//
//        Mockito.when(addNewStudent()).thenReturn(student);
//        mockMvc.perform( MockMvcRequestBuilders
//                        .post("/api/v1/student")
//                        .content(new ObjectMapper().writeValueAsString(new Student(1L,
//                                "Abhirami",
//                                "Abhirami@gmail.com",
//                                40)))
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk());
//    }
//    }


import com.demo.SpringBootTest.entity.Student;
import com.demo.SpringBootTest.repository.StudentRepository;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class StudentServiceTest {

    @Mock
    StudentRepository studentRepository;
    @InjectMocks
    StudentService studentService;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addNewStudent() {
        Student student = new Student();
        student.setName("abhirami");
        student.setEmail("abhi@gmail.com");
        when(studentRepository.save(ArgumentMatchers.any(Student.class))).thenReturn(student);
        Student created = studentService.addNewStudent(student);
        AssertionsForClassTypes.assertThat(created.getName()).isSameAs(student.getName());
//Mockito Verify methods are used to check that certain behavior happened.
// We can use Mockito verify methods at the end of the testing method code to make sure that specified methods are called
        verify(studentRepository).save(student);
    }

}
