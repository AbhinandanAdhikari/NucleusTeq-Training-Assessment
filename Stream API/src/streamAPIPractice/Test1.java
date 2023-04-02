// Implementing Stream API 
package streamAPIPractice;

import java.util.*;
import java.util.stream.*;

public class Test1 {
	public static void main(String args[])
	{
		List<Integer> arr = Arrays.asList(1,2,3,4,5,6);
		System.out.println(arr);
		// Filtering even numbers:
		List<Integer> even = arr.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println("Filtered Even Numbers : "+even);
		
		//Square all the numbers using Map:
		List<Integer>square = arr.stream().map(n->n*n).collect(Collectors.toList());
		System.out.println("Square Array : "+square);
		
		// Sum of array using Reduce:
		int sum =  arr.stream().reduce(0,(a,b)->a+b);
		System.out.println("SUM : "+sum);
	}
}
