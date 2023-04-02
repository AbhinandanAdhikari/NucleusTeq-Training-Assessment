// Task : Reverse k elements in Queue.
package queuePractice;
import java.util.*;
public class Test {
	static void reverseQueue(Queue<Integer> q, int k)
	{
		Stack<Integer>st = new Stack<>(); // Using stack
		for(int i=0;i<k;i++)
		{
			st.push(q.poll());
		}
		while(!st.empty())
		{
			q.add(st.pop());
		}
		for(int i=0;i<q.size()-k;i++)
		{
			q.add(q.poll());
		}
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no of elements:");
		int n = in.nextInt(); in.nextLine();
		Queue<Integer> q = new LinkedList<>();
		for(int i=0;i<n;i++)
		{
			int val = in.nextInt(); in.nextLine();
			q.add(val);
		}
		System.out.println("Before reverse : "+q);
		System.out.println("Enter the value of K");
		int k = in.nextInt();
		reverseQueue(q,k);
		System.out.println("After Reversal :"+ q);
	}
}
