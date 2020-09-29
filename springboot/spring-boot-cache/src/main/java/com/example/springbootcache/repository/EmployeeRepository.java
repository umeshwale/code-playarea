package com.example.springbootcache.repository;

import com.example.springbootcache.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Id> {
    Optional<Employee> findById(Long id);

    void deleteById(Long id);

    @Query("select firstName from Employee")
    List<String> getEmployeeFirstNames();
}
