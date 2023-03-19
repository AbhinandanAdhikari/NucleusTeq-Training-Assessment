// Task : Implement file read method.
package FileHandling;
import java.io.*;
import java.util.*;
public class TestRead {
	public static void implementFileRead(String path) throws Exception
	{
		FileInputStream fos = new FileInputStream(path);
		byte b[]=new byte[fos.available()];
		fos.read(b);
		String str = new String(b);
		System.out.println(str);
		fos.close();
	}
	@SuppressWarnings("resource")
	public static void main(String args[]) throws Exception
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the file path"+"\n");
		String path = in.nextLine();
		implementFileRead(path);
	}
}
