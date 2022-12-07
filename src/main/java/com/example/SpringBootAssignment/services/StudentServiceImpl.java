package com.example.SpringBootAssignment.services;


import com.example.SpringBootAssignment.models.Student;
import com.example.SpringBootAssignment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

//  @Service marks a Java class that performs some service,
//  such as executing business logic, performing
//  calculations, and calling external APIs.
@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public ArrayList<Student> findAllStudents() {
        return (ArrayList<Student>) studentRepository.findAll();
    }

    @Override
    public Student findAllStudentByID(long id) {

        //need to understand this Optional class
        Optional<Student> student = studentRepository.findById(id);

        return student.orElse(null);
    }

    @Override
    public void addStudent() {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Senzo", "Kunene", "Male", 24, "Durban"));
        students.add(new Student( "Thato", "Solly", "Female", 15, "Cape Town"));
        students.add(new Student( "Kgotso", "Matjato", "Male", 23, "Welkom"));
        students.add(new Student( "Linda", "Sthole", "Female", 20, "Bloem"));
        students.add(new Student( "Danny", "Kay", "Male", 30, "Durban"));

        for(Student student : students)
        {
            studentRepository.save(student);
        }

    }

    @Override
    public void deleteAllData() {
        studentRepository.deleteAll();
    }
}
