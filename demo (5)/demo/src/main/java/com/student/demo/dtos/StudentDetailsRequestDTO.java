package com.student.demo.dtos;

import lombok.Data;

import java.time.LocalDate;
@Data
public class StudentDetailsRequestDTO {
    private String name;
    private String email;
    private LocalDate dob;
    private String street;
    private String city;
    private String state;
    private Long phoneNumber;
    private Long pincode;
    private Integer age;
    private Long studentId;

}
