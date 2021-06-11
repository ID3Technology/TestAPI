package com.example.testapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.transaction.Transactional;
@Service
@Transactional
public class EmployeeService {
	
	@Autowired
    private EmployeeRepository employeeRepository;
	
    public List<Employee> listAllUser() {
        return employeeRepository.findAll();
    }
    
    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findById(id).get();
    }
  
    public int getEmployeeByCustomerId(Integer customer_id) {
       return employeeRepository.findBycustomer_id(customer_id).getCustomer_id();
    }
  
   

}
