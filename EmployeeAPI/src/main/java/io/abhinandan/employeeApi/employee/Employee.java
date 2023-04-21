package io.abhinandan.employeeApi.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	int empId;
	String empName;
	String dob;
	int salary;
	public Employee()
	{
		
	}
	public Employee(int empId, String empName, String dob, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dob = dob;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
