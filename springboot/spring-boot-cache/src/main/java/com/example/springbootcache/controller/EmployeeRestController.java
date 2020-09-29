package com.example.springbootcache.controller;

import com.example.springbootcache.entity.Employee;
import com.example.springbootcache.repository.EmployeeRepository;
import com.example.springbootcache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
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
    @Cacheable(value = "allEmployee")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        System.out.println("In the getAllEmployee method");
        List<Employee> employeeList = service.getAllEmployee();
        return new ResponseEntity<List<Employee>>(employeeList, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @CachePut(value = "employeeID", key = "#id")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id) throws Exception {
        System.out.println("In the getEmployeeById method");
        Employee employeeList = service.getEmployeeById(id);
        return new ResponseEntity<Employee>(employeeList, new HttpHeaders(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @CacheEvict(value = "deleteById", key = "#id")
    public HttpStatus deleteById(@PathVariable("id") Long id) throws Exception {
        System.out.println("In the deleteById method");
        service.deleteEmployeeById(id);
        return HttpStatus.OK;
    }

    @PostMapping
    public ResponseEntity<Employee> createOrUpdateEmployee(Employee employee)
            throws Exception {
        System.out.println("In the createOrUpdateEmployee method");
        Employee updated = service.createOrUpdateEmployee(employee);
        return new ResponseEntity<Employee>(updated, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/firstNames")
    @Cacheable(value="employeeFirstNames")
    public ResponseEntity<List<String>> getEmployeeFirstNames() {
        System.out.println("In the getEmployeeFirstNames method");
        List<String> employeeList = service.getEmployeeFirstNames();
        return new ResponseEntity<List<String>>(employeeList, new HttpHeaders(), HttpStatus.OK);
    }


}
