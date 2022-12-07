package com.example.SpringBootAssignment.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

// @Entity annotation defines that a
// class can be mapped to a table
@Entity

// @Getter, @Setter annotation defines the
// getters and setter methods for the properties
@Getter
@Setter
public class Student
{
    // @Id This annotation specifies
    // the primary key of the entity.
    @Id

    // @GeneratedValue This annotation
    // is used to specify the primary
    // key generation strategy to use
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String surname;
    private String gender;
    private int age;
    private String city;

    //default constructor
    public Student() {
        super();
    }

    //non-default constructor
    public Student(String name, String surname, String gender, int age, String city) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.city = city;
    }
}
