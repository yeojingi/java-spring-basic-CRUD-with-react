package com.arjuncodes.studysystem.service;

import com.arjuncodes.studysystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent (Student student);
    public List<Student> getAllStudents();
}
