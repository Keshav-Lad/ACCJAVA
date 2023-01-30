package com.example.demo.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public interface EmployeeRepositery extends JpaRepository<Employee,Integer> {
	
}
