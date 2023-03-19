// Task : Implement Generic Class and Generic Method
package JavaGenerics;

class GenericDemo<T> //Generic Class
{
	T data;
	public void addData(T val)
	{
		this.data = val;
	}
	public T getData()
	{
		return this.data;
	}
}
@SuppressWarnings("unchecked")
class GenericArray<T>
{
	T arr[] =(T[])new Object[10];
	int length = 0;
	public void append(T val)
	{
		arr[length++] = val;
	}
	public void display()
	{
		for(int i=0;i<length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
public class Test1 {
	static <T> void show(T[] list) // Generic Method
	{
		for(T x : list)
		{
			System.out.println(x);
		}
	}
	public static void main(String args[])
	{
		GenericDemo<Integer> obj = new GenericDemo<>();
		obj.addData(10);
		System.out.println(obj.getData());
		
		GenericArray<String> ga = new GenericArray<>();
		ga.append("Hello");
		ga.append("World");
		ga.display();
		
		show(new String[] {"Hello","Method"});
	}
}
