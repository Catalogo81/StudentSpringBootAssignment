package com.example.SpringBootAssignment.services;

import com.example.SpringBootAssignment.models.Student;

import java.util.ArrayList;

public interface StudentService {

    ArrayList<Student> findAllStudents();

    Student findAllStudentByID(long id);

    //creates a student
    void addStudent();

    //deletes all students
    void deleteAllData();
}
