package io.abhinandan.employeeAPIDB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.abhinandan.employeeAPIDB.Model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> 
{
	
}
