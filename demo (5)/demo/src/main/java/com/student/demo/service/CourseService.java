package com.student.demo.service;

import com.student.demo.Exception.TeacherNotFoundException;
import com.student.demo.dtos.TeacherandCourseDetailsDTO;
import com.student.demo.entity.Course;
import com.student.demo.entity.Teacher;
import com.student.demo.repository.CourseRepository;
import com.student.demo.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourseService {
    private final CourseRepository courseRepository;
    private final TeacherRepository teacherRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository,TeacherRepository teacherRepository){
        this.courseRepository=courseRepository;
        this.teacherRepository=teacherRepository;
    }
    public void addNewCourseWithTeacher(TeacherandCourseDetailsDTO teacherDetails){
        Optional<Teacher> teacher=teacherRepository.findById(teacherDetails.getTeacherId());
        Course course1 = new Course();
        teacherDetails.getCourseList().stream().forEach(course -> {
            course1.setCoursename(course.getName());
            course1.setDuration(course.getDuration());
        });

        if(teacher.isPresent())
           course1.setTeacher(teacher.get());
        else
            throw new TeacherNotFoundException("Teacher id not found");
        courseRepository.save(course1);

    }
}
