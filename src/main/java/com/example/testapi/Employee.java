package com.example.testapi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	private int id;
	private int customer_id;
	private String first_name;
    private String middle_name;
    private String last_name;
    
    public Employee() {
    }
    
    public Employee( int id, int customer_id, String first_name,String middle_name, String last_name) {
    	this.customer_id = id;
    	this.customer_id = customer_id;
    	this.first_name = first_name;
    	this.middle_name = middle_name;
    	this.last_name = last_name;
    }
    
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


}
