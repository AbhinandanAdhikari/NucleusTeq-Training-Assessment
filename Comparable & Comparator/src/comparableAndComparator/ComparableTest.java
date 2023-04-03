// Implementing comparator and comparable
package comparableAndComparator;
import java.util.*;

public class ComparableTest {
	public static void main(String args[])
	{
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
		Collections.sort(emp);
		System.out.println("------------------------");
		System.out.println("After Sorting : ");
		for(Employee e:emp)
		{
			System.out.println(e);
		}
	}
}
