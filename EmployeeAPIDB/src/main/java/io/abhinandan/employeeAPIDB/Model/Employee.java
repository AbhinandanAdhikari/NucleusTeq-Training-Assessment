package io.abhinandan.employeeAPIDB.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee 
{
	@Id
	int empId;
	String name;
	int age;
	int salary;
	
	public Employee(int empId, String name, int age, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public Employee() 
	{

	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
}
