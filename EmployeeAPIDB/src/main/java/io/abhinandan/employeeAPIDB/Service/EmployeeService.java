package io.abhinandan.employeeAPIDB.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.abhinandan.employeeAPIDB.Model.Employee;
import io.abhinandan.employeeAPIDB.Repository.EmployeeRepository;

@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeRepository employeeRepo;
	
	public void addEmployees(Employee emp)
	{
		employeeRepo.save(emp);
	}
	
	public List<Employee> getAllEmployees()
	{
		List<Employee> employees = employeeRepo.findAll();
		return employees;
	}
	
	public Employee getEmployee(int empId)
	{
		Employee emp = employeeRepo.findById(empId).get();
		return emp;
	}
	
	public void deleteEmployee(int empId)
	{
		employeeRepo.deleteById(empId);
	}
	
	public void updateEmployee(int empId, Employee emp)
	{
		Employee empold = employeeRepo.findById(empId).get();
		empold.setEmpId(emp.getEmpId());
		empold.setName(emp.getName());
		empold.setAge(emp.getAge());
		empold.setSalary(emp.getSalary());
		employeeRepo.save(empold);
	}
}
