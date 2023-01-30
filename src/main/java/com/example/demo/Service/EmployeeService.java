package com.example.demo.Service;

import com.example.demo.model.Employee;
import java.util.*;

public interface EmployeeService {
		
	Employee saveEmployee(Employee emp);
	
	Employee updateEmployee(Employee emp);
	
	List<Employee> getAllEmployee();
	
	
	public void deleteById(int id);
	
	
	
}
