package com.example.SpringBootAssignment.repository;

import com.example.SpringBootAssignment.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

// @Repository is a Spring annotation that
// indicates that the decorated class is a repository.
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    ArrayList<Student> findAllStudents();

}
