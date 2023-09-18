package com.springboot.bekazone_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.bekazone_spring.entity.Student;
import com.springboot.bekazone_spring.repository.StudentRepository;

@SpringBootApplication
public class BekazoneSpringApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BekazoneSpringApplication.class, args);
    }

    // @Autowired
    // private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        // Student student1 = new Student(1L, "Ramesh", "Fadera", "Ramesh@email.com");
        // studentRepository.save(student1);

    }

}
