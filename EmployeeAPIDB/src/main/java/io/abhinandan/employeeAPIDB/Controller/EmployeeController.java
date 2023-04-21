package io.abhinandan.employeeAPIDB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.abhinandan.employeeAPIDB.Model.Employee;
import io.abhinandan.employeeAPIDB.Service.EmployeeService;

@RestController
public class EmployeeController 
{
	@Autowired
	private EmployeeService empService;
	
	@RequestMapping("/employees")
	public List<Employee> getAllEmployee()
	{
		List<Employee> emp = empService.getAllEmployees();
		return emp;
	}
	@RequestMapping("/employee/{empId}")
	public Employee getEmployee(@PathVariable int empId)
	{
		return empService.getEmployee(empId);
	}
	@RequestMapping(method = RequestMethod.POST, value = "/addEmployee")
	public void addEmployee(@RequestBody Employee emp)
	{
		empService.addEmployees(emp);
	}
	@RequestMapping(method = RequestMethod.DELETE, value = "/deleteemployee/{empId}")
	public void deleteEmployee(@PathVariable int empId)
	{
		empService.deleteEmployee(empId);
	}
	@RequestMapping(method = RequestMethod.PUT, value = "/updateEmployee/{empId}")
	public void updateEmployee(@PathVariable int empId, @RequestBody Employee emp)
	{
		empService.updateEmployee(empId, emp);
	}
}
