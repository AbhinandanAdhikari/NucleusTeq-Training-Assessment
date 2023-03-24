package setAssignments;
import java.util.*;
public class SetTest {
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
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.addAll(arr);
		System.out.println(hs);
	}
}
