package com.springboot.bekazone_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.bekazone_spring.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
