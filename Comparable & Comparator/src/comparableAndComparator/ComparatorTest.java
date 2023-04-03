// Implementing comparator and comparable
package comparableAndComparator;
import java.util.*;
class Employee implements Comparable<Employee>
{
	 int age;
	 String name;
	
	public Employee(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	public String toString()
	{
		return this.age + " " + this.name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.getAge()>o.getAge())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
public class ComparatorTest {
	public static void main(String args[])
	{
		Comparator<Employee> cmp = ( i, j)->{ // Function Interface -- implementing compare(i,j) method
			if(i.getAge()>j.getAge())
			{
				return 1;
			}
			else
			{
				return -1;
			}
		};
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee(20,"Abhinandan"));
		emp.add(new Employee(30,"Raj"));
		emp.add(new Employee(50,"Aryan"));
		emp.add(new Employee(33,"Abhishek"));
		System.out.println("Before sorting :");
		for(Employee e:emp)
		{
			System.out.println(e);
		}
		Collections.sort(emp,cmp);
		System.out.println("------------------------");
		System.out.println("After Sorting : ");
		for(Employee e:emp)
		{
			System.out.println(e);
		}
	}
}
