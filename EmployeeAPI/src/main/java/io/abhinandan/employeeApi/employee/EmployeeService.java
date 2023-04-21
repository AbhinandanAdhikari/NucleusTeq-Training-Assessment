package io.abhinandan.employeeApi.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeRepository empRepo;
	
	public List<Employee> getAllEmployee()
	{
		List<Employee> emp = new ArrayList<>();
		empRepo.findAll().forEach(emp::add);
		return emp;
	}
	
	public void addEmployee(Employee emp)
	{
		empRepo.save(emp);
	}
	
	public Employee getEmployeeById(int id)
	{
		return empRepo.findById(id).get();
	}
	
	public void updateEmployeeById(Employee emp, int id)
	{
		Employee oldEmp = empRepo.findById(id).get();
		oldEmp.setEmpId(emp.getEmpId());
		oldEmp.setEmpName(emp.getEmpName());
		oldEmp.setDob(emp.getDob());
		oldEmp.setSalary(emp.getSalary());
		empRepo.save(oldEmp);
	}
	
	public void deleteEmployeeById(int id)
	{
		empRepo.deleteById(id);
	}
}
