// Task : Implement Lower and Upper Bound in Generics 
package JavaGenerics;

@SuppressWarnings("unchecked")
class List<T>
{
	T list[] = (T[])new Object[5];
	int length=0;
	public void add(T val)
	{
		list[length++] = val;
	}
	public void display()
	{
		for(int i=0;i<length;i++)
		{
			System.out.println(list[i]);
		}
	}
}
public class Test3 {
	public static void showUpperBound(List<? extends Number> obj) // Upper Bound
	{
		obj.display();
	}
	public static void showLowerBound(List<? super Integer> obj) // Lower Bound
	{
		obj.display();
	}
	public static void main(String args[])
	{
		List<Integer> obj1 = new List<>();
		obj1.add(1);
		obj1.add(2);
		List<Double> obj2 = new List<>();
		obj2.add(1.0);
		obj2.add(2.0);
		showUpperBound(obj1);
		showUpperBound(obj2);
//		showLowerBound(obj2); will not work
		List<Number> obj3 = new List<>();
		obj3.add(1);
		obj3.add(2.0f);
		showLowerBound(obj3);
	}
}
