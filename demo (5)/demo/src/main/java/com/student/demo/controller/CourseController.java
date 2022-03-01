package com.student.demo.controller;


import com.student.demo.dtos.TeacherDetailsDTO;
import com.student.demo.dtos.TeacherandCourseDetailsDTO;
import com.student.demo.service.CourseService;
import com.student.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="api/v1/course")
public class CourseController {
    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping
    public void registerNewTeacherwithCourse(@RequestBody TeacherandCourseDetailsDTO teacherCourseDto){
        courseService.addNewCourseWithTeacher(teacherCourseDto);
    }

}
