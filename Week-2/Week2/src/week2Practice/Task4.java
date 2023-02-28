// Task 4: Write a program to search 2nd highest number from an array.

package week2Practice;
import java.util.*;
public class Task4 {
	
	static int search2ndHighest(int arr[])
	{
		int max1=Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max1)
			{
				max2=max1;
				max1=arr[i];
			}
			else if(arr[i]>max2 && arr[i]!=max1)
			{
				max2=arr[i];
			}
		}
		return max2;
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
		int max2 = search2ndHighest(arr);
		System.out.println(max2);
	}
}
