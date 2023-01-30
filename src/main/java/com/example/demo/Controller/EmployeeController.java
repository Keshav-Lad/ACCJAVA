package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.EmployeeService;
import com.example.demo.Service.EmployeeServiceImpl;
import com.example.demo.model.Employee;

@RestController
public class EmployeeController {
	
	
	@Autowired
	EmployeeService emp;
	
	@PostMapping("/addemp")
	public Employee savaEmployee(@RequestBody Employee employee) {
		return emp.saveEmployee(employee);
	}
	@PostMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return emp.updateEmployee(employee);
	}
	
	@GetMapping("/getAll")
	public List<Employee>getAllEmp(){
		return emp.getAllEmployee();
		
	}
	
	@DeleteMapping("/emp/{id}")
	public String deleteById(@PathVariable("id") int id) {
		
		emp.deleteById(id);
		return "Deleted";	
	}
}
