// Task 5: Write a program to convert currency in respective country using switch case.
package week3AssignmentsByPriyanka;
import java.util.*;

public class Task5 {
	
	static void convertCurrency(double rupee, String country)
	{
		double amount = 0;
		switch(country)
		{
		case "US":
			amount = rupee * 0.0121;
			System.out.println("$"+amount);
			break;
		case "AUS":
			amount = rupee * 0.0179;
			System.out.println(amount);
			break;
		case "UAE":
			amount = rupee * 0.0443;
			System.out.println(amount);
			break;
		case "CAD":
			amount = rupee * 0.0164;
			System.out.println(amount);
			break;
		default : 
			System.out.println("Wrong input");
			break;
		}
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter currency in Indian Rupees");
		double rupee = in.nextDouble();in.nextLine();
		System.out.println("Enter the country name: US, AUS, UAE, CAD");
		String country = in.nextLine();
		convertCurrency(rupee,country);
	}
}
