// Task : Try different types of Exceptions in Java.
package exceptionHandling;
import java.util.*;
import java.io.*;
public class Test1 {
	public static void main(String args[])
	{
		try
		{
			int num = 100 / 0;
			System.out.println(num);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage()+" error.");
		}
		try
		{
			int arr[] = new int[1];
			System.out.println(arr[2]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage() + " error.");
		}
		try
		{
			String str = null;
			System.out.println(str.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
