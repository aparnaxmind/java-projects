package com.demo.SpringBootTest.service;

import com.demo.SpringBootTest.entity.Student;
import com.demo.SpringBootTest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {
    private  final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository1) {
        this.studentRepository = studentRepository1;

    }

    public List<Student> getStudents()
    {
        return  studentRepository.findAll();
    }

    public Student addNewStudent(Student student) {
        Optional<Student> studentOptional = studentRepository.
                findStudentByEmail(student.getEmail());
        if(studentOptional.isPresent()){
            throw new IllegalMonitorStateException("Email taken");
        }
        //studentRespository.save(student);
        return studentRepository.save(student);
    }

    public void deleteStudent(Long studentId) {

        Optional<Student> studentOptional = studentRepository.findById(studentId);

        if(studentOptional.isPresent()){
            studentRepository.deleteById(studentId);
        }
        else{
            throw  new IllegalStateException("No student details found");
        }
       /*boolean exists= studentRespository.existsById(studentId);
        //System.out.println(exists);
        if(!exists){
            throw  new IllegalStateException("No student details found");
        }*/
        /*studentRespository.deleteById(studentId);*/
    }

    @Transactional
    public void updateStudent(Long studentId, String name, String email) {
        Student student = studentRepository.findById(studentId).orElseThrow(()->new IllegalStateException("no student details found"));
        if(name !=null && name.length()>0 && !Objects.equals(student.getName(),name)){
            student.setName(name);
        }
        if(email !=null && email.length()>0 && !Objects.equals(student.getEmail(),email)){
            student.setEmail(email);
        }
    }

    public Student updateStudentNew(Long studentId,Student student){
        studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalStateException("no student details found"));
        student.setId(studentId);
        return studentRepository.save(student);
    }

    /*public List<Student> getStudents()
    {
        return  List.of(
                new Student(
                        101,
                        "Abhirami",
                        "Abhirami@gmail.com",
                        LocalDate.of(1990,3,6),
                        30
                )
        );
    }*/
}
