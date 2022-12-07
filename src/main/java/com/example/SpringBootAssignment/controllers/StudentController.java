package com.example.SpringBootAssignment.controllers;

import com.example.SpringBootAssignment.models.Student;
import com.example.SpringBootAssignment.services.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StudentController {

    @Autowired
    StudentServiceImpl studentServiceImpl;

    @PostMapping("/")
    public void add()
    {
        studentServiceImpl.addStudent();
    }

    @GetMapping("/findAll")
    public ArrayList<Student> getAllStudents()
    {
        return studentServiceImpl.findAllStudents();
    }

    @GetMapping("/findAllById/{id}")
    public Student getStudentById(@PathVariable long id)
    {
        return studentServiceImpl.findAllStudentByID(id);
    }

    @DeleteMapping("/delete")
    public void deleteStudents()
    {
        studentServiceImpl.deleteAllData();
    }
}
