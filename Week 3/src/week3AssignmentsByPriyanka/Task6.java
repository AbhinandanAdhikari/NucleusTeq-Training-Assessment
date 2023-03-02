//Task 6: Write a program to find highest of three numbers.
package week3AssignmentsByPriyanka;
import java.util.*;
public class Task6 {
	
	static int highest(int num1, int num2, int num3)
	{
		if(num1 > num2 && num1 > num3)
		{
			return num1;
		}
		else if(num2 > num1 && num2 > num3)
		{
			return num2;
		}
		return num3;
	}
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		int max = highest(num1,num2,num3);
		System.out.println(max);
	}
}
