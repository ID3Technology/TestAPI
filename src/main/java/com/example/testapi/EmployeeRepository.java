package com.example.testapi;

import java.util.List;

//CrudRepository<Employee, Integer> {

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	  Employee findBycustomer_id(Integer customer_id);

}
