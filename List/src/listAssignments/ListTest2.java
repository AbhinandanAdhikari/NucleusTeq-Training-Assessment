/*Task : create a menu program with following options .

1. add

2.remove

3.display element

4.exit

program should run until user choose 4th option.*/
package listAssignments;
import java.util.*;
public class ListTest2 {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		ArrayList<Integer>arr = new ArrayList<>();
		int ch=-1;
		int num=-1;
		do
		{
			System.out.println("1. Add");
			System.out.println("2. Remove");
			System.out.println("3. Display Element");
			System.out.println("4. Exit");
			System.out.println("Enter your choice");
			ch = in.nextInt(); in.nextLine();
			
			switch(ch)
			{
			case 1:
				System.out.println("enter the element you want to add");
				num = in.nextInt();
				arr.add(num);
				break;
			case 2:
				System.out.println("Enter the position you want to remove");
				int index = in.nextInt(); in.nextLine();
				arr.remove(index-1);
				break;
			
			case 3:
				System.out.println(arr);
				break;
			
			case 4: 
				System.out.println("exited");
				break;
			default: 
				System.out.println("Invalid choice");
				break;
			}
		} while(ch!=4);
	}
}
