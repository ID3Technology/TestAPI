package com.example.testapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
    EmployeeService employeeService;
	
	

    @GetMapping("")
    public List<Employee> list() {
        return employeeService.listAllUser();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Employee> get(@PathVariable Integer id) {
        try {
        	Employee user = employeeService.getEmployeeById(id);
            return new ResponseEntity<Employee>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
        }
    }
    
    @GetMapping("/customerid/{customer_id}")
    public ResponseEntity<Employee> getCustomer(@PathVariable Integer customer_id) {
        try {
        	int user2 = employeeService.getEmployeeByCustomerId(customer_id);
            return new ResponseEntity<Employee>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
        }
    }
    
    
    
    
    
    //@GetMapping("/employeetype/{employee_type}")


   
    

    
    
}
