// Internal working of Streams
package streamAPIPractice;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Test2 {
	public static void main(String args[])
	{
		List<Integer>arr = Arrays.asList(1,2,3,4,5,6);
		
		// Predicate Interface for filter():
		Predicate<Integer>p= n->n%2==0;
		List<Integer> filteredEven = arr.stream().filter(p).collect(Collectors.toList());
		System.out.println(filteredEven);
		
		// Function Interface for map():
		Function<Integer,Integer> f = n->n*n;
		List<Integer> mapSquare = arr.stream().map(f).collect(Collectors.toList());
		System.out.println(mapSquare);
	}
}
