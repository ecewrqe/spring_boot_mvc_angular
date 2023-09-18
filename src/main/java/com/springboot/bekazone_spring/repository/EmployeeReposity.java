package com.springboot.bekazone_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.bekazone_spring.model.Employee;

@Repository
public interface EmployeeReposity extends JpaRepository<Employee, Long> {

}
