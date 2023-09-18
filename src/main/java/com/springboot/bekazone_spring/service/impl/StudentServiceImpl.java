package com.springboot.bekazone_spring.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.bekazone_spring.entity.Student;
import com.springboot.bekazone_spring.repository.StudentRepository;
import com.springboot.bekazone_spring.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {

        return studentRepository.findAll();
    }

}
