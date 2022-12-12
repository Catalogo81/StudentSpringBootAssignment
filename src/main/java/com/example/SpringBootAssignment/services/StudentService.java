package com.example.SpringBootAssignment.services;

import com.example.SpringBootAssignment.models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service//added this from debugging
public interface StudentService {

    ArrayList<Student> findAllStudents();

    Student findAllStudentByID(long id);

    //creates a student
    void addStudent();

    //deletes all students
    void deleteAllData();
}
