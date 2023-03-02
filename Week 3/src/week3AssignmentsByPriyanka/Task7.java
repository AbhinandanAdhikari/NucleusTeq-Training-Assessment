// Task 7: Write a program to check valid input pin number format.
package week3AssignmentsByPriyanka;
import java.util.*;
public class Task7 {
	
	static boolean validatePinCode(String input)
	{
		if(input.matches("[0-9]{6}"))
			return true;
		return false;
	}
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		boolean check = validatePinCode(input);
		System.out.println(check);
	}
}
