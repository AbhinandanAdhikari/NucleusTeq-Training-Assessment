package StudentTest;
import Student.*;
import java.util.*;
public class StudentTest {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of Students");
		int n = in.nextInt();
		Student arr[] = new Student[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter student roll no");
			int roll = in.nextInt(); in.nextLine();
			System.out.println("enter student name");
			String name = in.nextLine();
			System.out.println("enter course");
			String course = in.nextLine();
			System.out.println("Enter subject 1 marks");
			int marks1 = in.nextInt(); in.nextLine();
			System.out.println("Enter subject 2 marks");
			int marks2 = in.nextInt(); in.nextLine();
			System.out.println("Enter subject 3 marks");
			int marks3 = in.nextInt(); in.nextLine();
			arr[i] = new Student(roll,name,course,marks1,marks2,marks3);
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
