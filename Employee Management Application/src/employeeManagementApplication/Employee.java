package employeeManagementApplication;
import java.io.*;

@SuppressWarnings("serial")
public class Employee implements Serializable {
	int empID;
	String empName;
	int age;
	int salary;
	
	public Employee(int id, String name, int age, int sal)
	{
		this.empID=id;
		this.empName=name;
		this.age=age;
		this.salary=sal;
	}
	public String toString()
	{
		return this.empID+ " | "+ this.empName + " | "+this.age+" | "+this.salary;
	}
	
	public void setID(int id)
	{
		this.empID=id;
	}
	public int getID()
	{
		return this.empID;
	}
	public void setName(String name)
	{
		this.empName=name;
	}
	public String getName()
	{
		return this.empName;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return this.age;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public int getSalary()
	{
		return this.salary;
	}
}
