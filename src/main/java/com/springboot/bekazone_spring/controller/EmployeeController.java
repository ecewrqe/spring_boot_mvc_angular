package com.springboot.bekazone_spring.controller;

import java.net.http.HttpHeaders;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bekazone_spring.exception.ResourceNotFoundException;
import com.springboot.bekazone_spring.model.Employee;
import com.springboot.bekazone_spring.repository.EmployeeReposity;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeReposity employeeReposity;

    // get all employee
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/employees")
    public List<Employee> getAllEmployee(@RequestHeader(name = "aaa", defaultValue = "") String aaa,
            @RequestParam(name = "title", defaultValue = "title_name") String title) {

        System.out.println("angular request");
        List<Employee> employees = employeeReposity.findAll();
        employees.get(0).setEmailId(title);
        return employees;
    }

    // create employee api
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) {

        employeeReposity.save(employee);
        System.out.println("save");
        return employee;
    }

    // get employee by id api
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long id) {
        Employee employee = employeeReposity.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + id));
        return ResponseEntity.ok(employee);
    }
}
