package com.student.demo.service;

import com.student.demo.dtos.CourseDTO;
import com.student.demo.dtos.TeacherDetailsDTO;
import com.student.demo.entity.Course;
import com.student.demo.entity.Teacher;
import com.student.demo.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;
    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<TeacherDetailsDTO> getTeacher(){

        List<Teacher> listOfTeacher=teacherRepository.findAll();
        List<TeacherDetailsDTO> teacherDTOS=new ArrayList<>();
        listOfTeacher.forEach(detail->{
            TeacherDetailsDTO teachr =new TeacherDetailsDTO();
           // teachr.setTeacherId(detail.getTeacherId());
            teachr.setTeacherName(detail.getName());
            teachr.setEmail(detail.getEmail());

            teachr.setContactNumber(detail.getContactNumber());
            //getTeacher().setCourseList();
            teacherDTOS.add(teachr);
        });
        return teacherDTOS;

    }
    public void addNewTeacher(TeacherDetailsDTO teacherDetails){

        Teacher teacher = new Teacher();
        teacher.setEmail(teacherDetails.getEmail());
        teacher.setName(teacherDetails.getTeacherName());
        teacher.setContactNumber(teacherDetails.getContactNumber());
       teacherRepository.save(teacher);

    }

    public TeacherDetailsDTO getTeacher(Long id){
          Optional<Teacher> teacher=teacherRepository.findById(id);
          TeacherDetailsDTO teacherDetailsDTO= new TeacherDetailsDTO();
          //teacherDetailsDTO.setTeacherId(teacher.get().getTeacherId());
          teacherDetailsDTO.setContactNumber(teacher.get().getContactNumber());

          teacherDetailsDTO.setTeacherName(teacher.get().getName());
          teacherDetailsDTO.setEmail(teacher.get().getEmail());
          return teacherDetailsDTO;
    }
    public void deleteTeacher(Long teacherId) {
        boolean exists= teacherRepository.existsById(teacherId);
        if(! exists){throw new IllegalStateException("teacher with id " + teacherId +"does not exists");
        }
        teacherRepository.deleteById(teacherId);
    }

    @Transactional
    public void updateTeacher(Long teacherId, String name, String email){
        com.student.demo.entity.Teacher teacher= teacherRepository.findById(teacherId).orElseThrow(()->new IllegalStateException("teacher with id " + teacherId +"does not exists"));

        if (name !=null && name.length()>0 && !Objects.equals(teacher.getName(),name)){
            teacher.setName(name);
        }
        if (email !=null && email.length()>0 && !Objects.equals(teacher.getEmail(),email)){
            Optional<Teacher> teacherOptional= teacherRepository.findTeacherByEmail(teacher.getEmail());
            if (teacherOptional.isPresent()){
                throw new IllegalMonitorStateException("email taken");
            }
            teacher.setEmail(email);

        }
    }


}



