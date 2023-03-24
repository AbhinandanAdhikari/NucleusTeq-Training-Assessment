package employeeManagementApplication;
import java.io.*;
import java.util.*;

public class EmployeeTest{
	@SuppressWarnings("unchecked")
	public static void main(String args[]) throws Exception
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int ch=-1;
		
		File file = new File("employee.txt");
		ArrayList<Employee> al = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		
		if(file.isFile())
		{
			ois=new ObjectInputStream(new FileInputStream(file));
			al = (ArrayList<Employee>)ois.readObject();
			ois.close();
		}
		boolean found = false;
		
		do {
			System.out.println("0. EXIT");
			System.out.println("1. INSERT");
			System.out.println("2. DISPLAY");
			System.out.println("3. UPDATE");
			System.out.println("4. DELETE");
			System.out.println("5. SEARCH BY EMPLOYEE ID");
			System.out.println("Enter your Choice:");
			ch = in.nextInt(); in.nextLine();
			
		switch(ch)
		{
		
		case 0: // Terminates the program
			System.out.println("Exited successfully");
			break;
			
		case 1: // Inserting Data
			System.out.println("Enter the employee ID to be inserted:");
			int id = in.nextInt(); in.nextLine();
			System.out.println("Enter the employee Name to be inserted:");
			String name = in.nextLine();
			System.out.println("enter the age to be inserted:");
			int age = in.nextInt();in.nextLine();
			System.out.println("Enter the employee salary to be inserted:");
			int salary = in.nextInt();in.nextLine();
			al.add(new Employee(id,name,age,salary));
			oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(al);
			oos.close();
			System.out.println("Data inserted successfully");
			break;
			
		case 2: // Display the data
			if(file.isFile())
			{
				ois=new ObjectInputStream(new FileInputStream(file));
				al = (ArrayList<Employee>)ois.readObject();
				ois.close();
				for(int i=0;i<al.size();i++)
				{
					System.out.print(al.get(i));
					System.out.println();
				}
			}
			else
			{
				System.out.println("File not found");
			}

			break;
			
		case 3: // For updating
			System.out.println("Enter the EmpID to be updated:");
			int empid = in.nextInt();in.nextLine();
			found = false;
			for(int i=0;i<al.size();i++)
			{
				if(al.get(i).empID == empid)
				{
					System.out.println("Enter new employee ID:");
					id = in.nextInt(); in.nextLine();
					System.out.println("Enter new employee Name:");
					name = in.nextLine();
					System.out.println("enter new age:");
					age = in.nextInt();in.nextLine();
					System.out.println("Enter new employee salary:");
					salary = in.nextInt();in.nextLine();
					al.get(i).setID(id);
					al.get(i).setName(name);
					al.get(i).setAge(age);
					al.get(i).setSalary(salary);
					oos = new ObjectOutputStream(new FileOutputStream(file));
					oos.writeObject(al);
					oos.close();
					found=true;
				}
			}
			if(found)
			{
				System.out.println("Data updated successfully");
			}
			else
			{
				System.out.println("Data Not found");
			}
			break;
			
		case 4: // For deleting
			System.out.println("Enter the EmpID to be Deleted:");
			empid = in.nextInt();in.nextLine();
			found = false;
			for(int i=0;i<al.size();i++)
			{
				if(al.get(i).empID == empid)
				{
					al.remove(i);
					oos = new ObjectOutputStream(new FileOutputStream(file));
					oos.writeObject(al);
					oos.close();
					found=true;
				}
			}
			if(found)
			{
				System.out.println("Deleted Successfully");
			}
			else
			{
				System.out.println("Data Not found");
			}
			break;
			
		case 5:
			System.out.println("Enter the EmpID to be Searched");
			empid = in.nextInt();in.nextLine();
			found = false;
			for(int i=0;i<al.size();i++)
			{
				if(al.get(i).getID() == empid)
				{
					System.out.println(al.get(i));
					found = true;
					break;
				}
			}
			if(found==false)
			{
				System.out.println("Data not found");
			}
			break;
		default: 
			System.out.println("Invalid choice");
			break;
		}
		}while(ch!=0);
	}
}
