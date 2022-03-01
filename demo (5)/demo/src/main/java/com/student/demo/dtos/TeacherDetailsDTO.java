package com.student.demo.dtos;

import com.student.demo.entity.Course;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class TeacherDetailsDTO {
    private String teacherName;
    private String email;
    private Long contactNumber;
}
