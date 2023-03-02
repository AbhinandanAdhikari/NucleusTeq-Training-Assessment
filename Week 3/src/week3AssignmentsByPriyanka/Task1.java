// Task 1: Write a program to print sum of all even numbers in an array.

package week3AssignmentsByPriyanka;
import java.util.*;

public class Task1 {
	
	static int sumOfEvenNumberinArray(int arr[])
	{
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				sum = sum + arr[i];
			}
		}
		return sum;
	}
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = in.nextInt();
		}
		int sum = sumOfEvenNumberinArray(arr);
		System.out.println("The sum of even numbers in array is "+sum);
	}
}
