package com.student.demo.dtos;

import com.student.demo.entity.Course;
import lombok.Data;

import java.util.List;

@Data
public class TeacherandCourseDetailsDTO {
    private Long teacherId;
    /*private String teacherName;
    private String email;
    private Long contactNumber;*/

    private List<CourseDTO> courseList;
}
