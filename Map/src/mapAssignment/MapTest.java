// Task : WAP to count Frequency of characters in a string using HashMap.
package mapAssignment;
import java.util.*;
public class MapTest {
	public static void main(String args[]) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String str =in.nextLine();
		System.out.println(str);
		str = str.trim();
		HashMap<Character,Integer> hm = new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(hm.containsKey(ch))
			{
				hm.put(ch,hm.get(ch)+1);
			}
			else
			{
				hm.put(ch,1);
			}
		}
		System.out.println(hm);
	}
}
