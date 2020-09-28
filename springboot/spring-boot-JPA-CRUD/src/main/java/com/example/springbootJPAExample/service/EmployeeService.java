package com.example.springbootJPAExample.service;

import com.example.springbootJPAExample.entity.Employee;
import com.example.springbootJPAExample.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployee() {
        return  employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) throws Exception {
        Optional<Employee> employee = employeeRepository.findById(id);

        if(employee.isPresent()) {
            return employee.get();
        } else {
            throw new Exception("No employee record exist for given id");
        }
    }

    public void deleteEmployeeById(Long id) throws Exception {
        Optional<Employee> employee = employeeRepository.findById(id);

        if(employee.isPresent()) {
            employeeRepository.deleteById(id);
        } else {
            throw new Exception("No employee record exist for given id");
        }

    }

    public Employee createOrUpdateEmployee(Employee entity) throws Exception
    {
        Optional<Employee> employee = employeeRepository.findById(entity.getId());

        if(employee.isPresent())
        {
            Employee newEntity = employee.get();
            newEntity.setEmail(entity.getEmail());
            newEntity.setFirstName(entity.getFirstName());
            newEntity.setLastName(entity.getLastName());

            newEntity = employeeRepository.save(newEntity);

            return newEntity;
        } else {
            entity = employeeRepository.save(entity);

            return entity;
        }
    }

    public List<String> getEmployeeFirstNames() {
        return employeeRepository.getEmployeeFirstNames();
    }
}
