package com.arjuncodes.studysystem.service;

import com.arjuncodes.studysystem.model.Student;
import com.arjuncodes.studysystem.repository.StudentRepository;
import com.arjuncodes.studysystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
