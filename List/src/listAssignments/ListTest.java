// Task 1: Write a program to store only unique elements in ArrayList.
package listAssignments;
import java.util.*;
public class ListTest {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("enter the no. of elements:");
		int n=in.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			int num = in.nextInt();in.nextLine();
			arr.add(num);
		}
		System.out.println(arr);
		HashSet<Integer> hs = new HashSet<>(arr);
		arr = new ArrayList<>(hs);
		System.out.println(arr);
	}
}
