// Task 3: Write a program to calculate Simple Interest and Compound Interest.
package week2Practice;
import java.util.*;

public class Task3 {
	
	static double calculateSimpleInterest(double p, double r, double t)
	{
		double ans = (p * r * t) / 100;
		return ans;
	}
	
	static double calculateAmount(double p, double r, double t)
	{
		double amt = p * Math.pow((1+(r/100)),t);
		return amt;
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		double principal = in.nextDouble();
		double rate = in.nextDouble();
		double time = in.nextDouble();
		double simpleInterest = calculateSimpleInterest(principal,rate,time);
		System.out.println(simpleInterest);
		double compoundInterest = calculateAmount(principal,rate,time) - principal;
		System.out.println(compoundInterest);
	}
}
