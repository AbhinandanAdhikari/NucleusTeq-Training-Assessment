package io.abhinandan.employeeApi.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
public class EmployeeController 
{
	@Autowired
	private EmployeeService empService;
	
	@RequestMapping("/employees")
	public List<Employee> getAllEmployees()
	{
		return empService.getAllEmployee();
	}
	
	@RequestMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable int id)
	{
		return empService.getEmployeeById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/employees")
	public void addEmployee(@RequestBody Employee emp)
	{
		empService.addEmployee(emp);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/employees/{id}")
	public void updateEmployeeById(@RequestBody Employee emp, @PathVariable int id)
	{
		empService.updateEmployeeById(emp, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/employees/{id}")
	public void deleteEmployeeById(@PathVariable int id)
	{
		empService.deleteEmployeeById(id);
	}
}
