// Task 2: Take one array as an input and separate even and odd numbers in separate arrays.
package week2Practice;
import java.util.*;

public class Task2 {
	
	static int[] getEvenArray(int arr[])
	{
		int even[] = new int[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even = Arrays.copyOf(even, even.length+1);
				even[even.length-1] = arr[i];
			}
		}
		return even;
	}
	
	static int[] getOddArray(int arr[])
	{
		int odd[] = new int[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2 != 0)
			{
				odd = Arrays.copyOf(odd,odd.length+1);
				odd[odd.length-1] = arr[i];
			}
		}
		return odd;
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
		int even[] = getEvenArray(arr);
		int odd[] = getOddArray(arr);
		for(int e : even)
		{
			System.out.print(e+" ");
		}
		System.out.println();
		for(int o : odd)
		{
			System.out.print(o+" ");
		}
	}
}
