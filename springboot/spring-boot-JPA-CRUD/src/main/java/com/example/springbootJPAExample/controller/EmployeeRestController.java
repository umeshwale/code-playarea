package com.example.springbootJPAExample.controller;

import com.example.springbootJPAExample.entity.Employee;
import com.example.springbootJPAExample.repository.EmployeeRepository;
import com.example.springbootJPAExample.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeRestController {
    @Autowired
    EmployeeService service;

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employeeList = service.getAllEmployee();
        return new ResponseEntity<List<Employee>>(employeeList, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id) throws Exception {
        Employee employeeList = service.getEmployeeById(id);
        return new ResponseEntity<Employee>(employeeList, new HttpHeaders(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteById(@PathVariable("id") Long id) throws Exception {
        service.deleteEmployeeById(id);
        return HttpStatus.OK;
    }

    @PostMapping
    public ResponseEntity<Employee> createOrUpdateEmployee(Employee employee)
            throws Exception {
        Employee updated = service.createOrUpdateEmployee(employee);
        return new ResponseEntity<Employee>(updated, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/firstNames")
    public ResponseEntity<List<String>> getEmployeeFirstNames() {
        List<String> employeeList = service.getEmployeeFirstNames();
        return new ResponseEntity<List<String>>(employeeList, new HttpHeaders(), HttpStatus.OK);
    }


}
