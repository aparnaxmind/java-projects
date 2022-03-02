package com.example.demo.repository;

import com.example.demo.entity.Student;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
//    Optional<Student> findStudentByEmail(String email);
//    public Student findByName(String name);

    Optional<Student> findStudentByEmail(String email);
}
